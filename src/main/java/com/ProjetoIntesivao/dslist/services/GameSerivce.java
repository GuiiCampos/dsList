package com.ProjetoIntesivao.dslist.services;

import com.ProjetoIntesivao.dslist.dto.GameAllDto;
import com.ProjetoIntesivao.dslist.dto.GameDTO;
import com.ProjetoIntesivao.dslist.entities.Game;
import com.ProjetoIntesivao.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameSerivce {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(x -> new GameDTO(x)).toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameAllDto findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameAllDto(result);
    }
}
