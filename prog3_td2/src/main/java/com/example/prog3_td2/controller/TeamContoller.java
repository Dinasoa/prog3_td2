package com.example.prog3_td2.controller;

import com.example.prog3_td2.controller.rest.TeamRest;
import com.example.prog3_td2.mapper.TeamMapper;
import com.example.prog3_td2.model.PlayerEntity;
import com.example.prog3_td2.model.TeamEntity;
import com.example.prog3_td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;

@RestController
@AllArgsConstructor

public class TeamContoller {
    private final TeamService service;
    private final TeamMapper mapper;

    @GetMapping("/teams")
    public List<TeamRest> getAllTeams(){
        return service.getAllTeams().stream().map(mapper::toRest).toList();
    }

}
