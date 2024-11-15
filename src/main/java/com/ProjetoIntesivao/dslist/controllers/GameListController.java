package com.ProjetoIntesivao.dslist.controllers;

import com.ProjetoIntesivao.dslist.dto.GameDTO;
import com.ProjetoIntesivao.dslist.dto.GameListDTO;
import com.ProjetoIntesivao.dslist.dto.ReplaceDTO;
import com.ProjetoIntesivao.dslist.services.GameListSerivce;
import com.ProjetoIntesivao.dslist.services.GameSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListSerivce gameListSerivce;
    @Autowired
    private GameSerivce gameSerivce;

    @GetMapping()
    public List<GameListDTO> findAll() {
        List<GameListDTO> allGames = gameListSerivce.findAll();
        return allGames;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameDTO> findByList(@PathVariable Long listId) {
        List<GameDTO> allGames = gameSerivce.findByList(listId);
        return allGames;
    }

    @PostMapping(value = "/{listId}/replace")
    public String move(@PathVariable Long listId, @RequestBody ReplaceDTO replaceDTO) {
        try {
            gameListSerivce.move(listId, replaceDTO.getSourceIndex(), replaceDTO.getDestinationIndex());
            return "Operação bem sucedida com sucesso!";
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
