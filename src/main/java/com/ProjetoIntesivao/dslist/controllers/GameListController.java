package com.ProjetoIntesivao.dslist.controllers;

import com.ProjetoIntesivao.dslist.dto.GameListDTO;
import com.ProjetoIntesivao.dslist.services.GameListSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListSerivce gameListSerivce;

    @GetMapping()
    public List<GameListDTO> findAll() {
        List<GameListDTO> allGames = gameListSerivce.findAll();
        return allGames;
    }

}
