package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

// tem que registrar essa classe como sendo um componente do sistema para o framework conseguir gerenciar 

@Service 
public class GameService {

	//instanciando o GameRepository no GameService ou o componente repository no componente service, conforme regra de negócio
	@Autowired
	private GameRepository gameRepository;
	//service retorna uma dto/lista dos games
	public List<Game> findAll() {
		
		List<Game> result = gameRepository.findAll();		//consultando lista no banco de dados
		return result;
	}
	
	
}
