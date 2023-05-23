package com.devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long>{

	
	} //consultar, salvar e deletar no banco de dados com SpringBoot 
	// no argumentoo tipo da entidade que é game, e o tipo do id da identidade, que é long.
	
	//CAMADA DE ACESSO A DADOS


