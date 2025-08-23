package com.gabrielxavier.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielxavier.dslist.dto.GameDTO;
import com.gabrielxavier.dslist.dto.GameMinDTO;
import com.gabrielxavier.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameListController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable long id){
		GameDTO result = gameService.fildById(id);
		return result;
	}
	
	@GetMapping
	public List<GameMinDTO> findAll(){ 
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

}
