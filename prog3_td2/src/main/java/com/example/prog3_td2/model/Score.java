package com.example.prog3_td2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
public class Score {
    @Id
    private int score_id;
    @ManyToMany
    private List<Player> player;
    @ManyToMany
    private List<PlayAgainst> matches;
    private int time;
}
