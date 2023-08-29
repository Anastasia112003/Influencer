package com.example.influencer.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "influencer")
public class Influencer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Integer subsAmount;
        @OneToMany
        private List<Subscriber> subsList=new ArrayList<>();
        private LocalDateTime lastUpdate;

}
