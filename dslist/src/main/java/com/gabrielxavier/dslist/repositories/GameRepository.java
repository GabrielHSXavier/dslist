package com.gabrielxavier.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielxavier.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
