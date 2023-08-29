package com.example.influencer.service;


import com.example.influencer.dto.InfluencerDTO;
import com.example.influencer.mapper.InfluencerMapper;
import com.example.influencer.model.Influencer;
import com.example.influencer.repository.InfluencerRepository;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class InfluencerService {
    private final KafkaTemplate<String, Object> kafkaTemplate;
    private final InfluencerMapper influencerMapper;


    private final InfluencerRepository postRepository;

    public InfluencerService(KafkaTemplate<String, Object> kafkaTemplate, InfluencerMapper influencerMapper, InfluencerRepository postRepository) {
        this.kafkaTemplate = kafkaTemplate;
        this.influencerMapper = influencerMapper;
        this.postRepository = postRepository;
    }

    public InfluencerDTO create(Influencer influencer) {
       Influencer savedInfluencer=postRepository.save(influencer);
        InfluencerDTO influencerDTO=influencerMapper.toDto(savedInfluencer);
        kafkaTemplate.send("influencer", influencerDTO);
        return influencerDTO;


    }
}



