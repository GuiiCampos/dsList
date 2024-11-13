package com.ProjetoIntesivao.dslist.controllers;

import com.ProjetoIntesivao.dslist.dto.GameDTO;
import com.ProjetoIntesivao.dslist.services.GameSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
