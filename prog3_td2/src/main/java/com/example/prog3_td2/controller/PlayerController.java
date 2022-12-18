package com.example.prog3_td2.controller;

import com.example.prog3_td2.mapper.PlayerMapper;
import com.example.prog3_td2.controller.rest.PlayerRest;
import com.example.prog3_td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class PlayerController {
    private final PlayerService service;
    private final PlayerMapper mapper;

    @GetMapping("/players")
    private List<PlayerRest> getAllPlayer(){
        return service.getAllPlayers().stream().map(mapper::toRest).toList() ;
    }
}
