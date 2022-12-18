package com.example.prog3_td2.service;
import com.example.prog3_td2.model.TeamEntity;
import com.example.prog3_td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor

public class TeamService {
    private TeamRepository repository;

    public List<TeamEntity> getAllTeams(){
        return repository.findAll();
    }
}
