package com.example.prog3_td2.mapper;

import com.example.prog3_td2.controller.rest.PlayAgainstRest;
import com.example.prog3_td2.controller.rest.PlayerRest;
import com.example.prog3_td2.controller.rest.TeamRest;
import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.model.TeamEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Comparator;

@Component
@AllArgsConstructor
public class TeamMapper {
    private PlayerMapper mapper;
    public TeamRest toRest (TeamEntity domain){
        return TeamRest.builder()
                .id(domain.getId())
                .sponsor(domain.getSponsorList())
                .players(domain.getPlayers().stream().sorted(Comparator.comparingInt(PlayerEntity::getNumber)).map(mapper::toRest).toList())
                .name(domain.getName())
                .build();
    }
}
