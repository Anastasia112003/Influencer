package com.example.influencer.repository;

import com.example.influencer.model.Influencer;
import com.example.influencer.model.Subscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
    public interface InfluencerRepository extends JpaRepository<Influencer, Long> {
    }
