package com.example.prog3_td2.controller;

import com.example.prog3_td2.controller.rest.PlayAgainstRest;
import com.example.prog3_td2.mapper.PlayAgainstMapper;
import com.example.prog3_td2.model.PlayAgainst;
import com.example.prog3_td2.service.PlayAgainstService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class PlayAgainstContoller {
    private PlayAgainstService service;
    private PlayAgainstMapper mapper;

    @GetMapping("/matchs")
    public List<PlayAgainstRest> listOfAllMatchs(){
        return service.getAllMatchs().stream().map(mapper::toRest).toList();
    }

}
