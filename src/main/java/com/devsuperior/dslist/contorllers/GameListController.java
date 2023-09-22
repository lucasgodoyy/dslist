package com.devsuperior.dslist.contorllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

@RestController // configurando essa classe para ser controlador
@RequestMapping(value = "/lists") // Mapear o recurso, configurando o caminho que vai ser respondido na api

public class GameListController {
	// injetando o service
	@Autowired
	private GameListService gameListService;


	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;

	}
}
