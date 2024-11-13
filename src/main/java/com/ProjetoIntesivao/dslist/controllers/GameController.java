package com.ProjetoIntesivao.dslist.controllers;

import com.ProjetoIntesivao.dslist.dto.GameAllDto;
import com.ProjetoIntesivao.dslist.dto.GameDTO;
import com.ProjetoIntesivao.dslist.services.GameSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameSerivce gameSerivce;

    @GetMapping()
    public List<GameDTO> findAll() {
        List<GameDTO> allGames = gameSerivce.findAll();
        return allGames;
    }

    @GetMapping(value = "/{id}")
    public GameAllDto findById(@PathVariable Long id) {
        GameAllDto result = gameSerivce.findById(id);
        return result;
    }

}
