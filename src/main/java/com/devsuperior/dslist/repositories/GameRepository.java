package com.devsuperior.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository <Game, Long>{
	//consultar, salvar e deletar no banco de dados com SpringBoot 
		// no argumentoo tipo da entidade que é game, e o tipo do id da identidade, que é long.
		
	
	//consulta sql costumizada no spring data jpa, deve retornar uma interface, chamada projection
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS gameYear, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId);
	
	
	
	
	} //consultar, salvar e deletar no banco de dados com SpringBoot 
	// no argumentoo tipo da entidade que é game, e o tipo do id da identidade, que é long.
	
	//CAMADA DE ACESSO A DADOS


