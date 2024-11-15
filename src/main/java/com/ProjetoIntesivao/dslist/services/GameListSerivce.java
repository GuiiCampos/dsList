package com.ProjetoIntesivao.dslist.services;

import com.ProjetoIntesivao.dslist.dto.GameListDTO;
import com.ProjetoIntesivao.dslist.entities.GameList;
import com.ProjetoIntesivao.dslist.projections.GameMinProjection;
import com.ProjetoIntesivao.dslist.repositories.GameListRepository;
import com.ProjetoIntesivao.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListSerivce {

    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
        return dto;
    }

    @Transactional
    public void move (Long listId, int sourceIndex, int destinationIndex){

        List<GameMinProjection> result = gameRepository.searchByList(listId);

        GameMinProjection obj = result.remove(sourceIndex);
        result.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;

        for(int i = min; i <= max; i++){
            gameListRepository.updateBelongingPosition(listId, result.get(i).getId(), i);
        }

    }

}
