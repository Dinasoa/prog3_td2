package com.example.prog3_td2.controller.rest;

import com.example.prog3_td2.model.TeamEntity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class PlayAgainstRest {
    private int id;
    private TeamRest team_opponent;
    private TeamRest team;
}
