package com.example.prog3_td2.controller.rest;
import com.example.prog3_td2.model.SponsorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class TeamRest {
    private int id;
    private String name;
    private List<SponsorEntity> sponsor;
    private List<PlayerRest> players;
}
