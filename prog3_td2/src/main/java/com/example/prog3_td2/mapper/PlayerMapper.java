package com.example.prog3_td2.mapper;

import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.controller.rest.PlayerRest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor

public class PlayerMapper {

    public PlayerRest toRest (PlayerEntity domain){
        return PlayerRest.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public PlayerEntity toDomain (PlayerRest rest){
        return PlayerEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .build();
    }

}
