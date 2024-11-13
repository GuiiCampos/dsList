package com.ProjetoIntesivao.dslist.repositories;

import com.ProjetoIntesivao.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
