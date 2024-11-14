package com.ProjetoIntesivao.dslist.repositories;

import com.ProjetoIntesivao.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Integer> {
}
