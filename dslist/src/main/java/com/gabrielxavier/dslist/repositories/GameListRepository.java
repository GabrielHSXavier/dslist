package com.gabrielxavier.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielxavier.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
