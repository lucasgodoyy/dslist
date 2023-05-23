package com.devsuperior.dslist.contorllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.services.GameService;

//configurando essa classe para ser controlador
@RestController

//Mapear o recurso, configurando o caminho que vai ser respondido na api
@RequestMapping(value = "/games")

//classe
public class GameController {

	//injetando o service
	@Autowired
	private GameService gameService;
	
	
	//método que vai ser executado na página
	@GetMapping
	public List<Game> findAll()  {
	List<Game> result = gameService.findAll();
	return result;
	
	}
}
