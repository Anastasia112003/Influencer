package com.example.influencer.mapper;

import com.example.influencer.dto.InfluencerDTO;
import com.example.influencer.model.Influencer;


import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface InfluencerMapper {

       InfluencerDTO toDto(Influencer influencer);

}
