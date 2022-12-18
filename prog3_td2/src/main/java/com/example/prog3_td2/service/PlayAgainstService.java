package com.example.prog3_td2.service;

import com.example.prog3_td2.model.PlayAgainst;
import com.example.prog3_td2.repository.PlayAgainstRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j

public class PlayAgainstService {
    private PlayAgainstRepository repository;

    public List<PlayAgainst> getAllMatchs(){
        return repository.findAll();
    }
}
