package com.example.influencer.controller;

import com.example.influencer.dto.InfluencerDTO;
import com.example.influencer.mapper.InfluencerMapper;
import com.example.influencer.model.Influencer;
import com.example.influencer.service.InfluencerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfluencerController {
    private final InfluencerService influencerService;

    public InfluencerController(InfluencerService influencerService) {
        this.influencerService = influencerService;
    }

    @PostMapping("/create")
    public InfluencerDTO create(@RequestBody Influencer influencer) {
        return influencerService.create(influencer);
    }

}

