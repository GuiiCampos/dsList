package com.ProjetoIntesivao.dslist.services;

import com.ProjetoIntesivao.dslist.dto.GameDTO;
import com.ProjetoIntesivao.dslist.entities.Game;
import com.ProjetoIntesivao.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameSerivce {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList();
        return dto;
    }

}
