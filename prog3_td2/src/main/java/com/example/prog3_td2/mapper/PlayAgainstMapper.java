package com.example.prog3_td2.mapper;

import com.example.prog3_td2.controller.rest.PlayAgainstRest;
import com.example.prog3_td2.model.PlayAgainst;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class PlayAgainstMapper {
    private final TeamMapper mapper;

    public PlayAgainstRest toRest (PlayAgainst domain){
        return PlayAgainstRest.builder()
                .id(domain.getId())
                .team_opponent(mapper.toRest(domain.getTeamOpponent()))
                .team(mapper.toRest(domain.getTeam()))
                .build();
    }

}
