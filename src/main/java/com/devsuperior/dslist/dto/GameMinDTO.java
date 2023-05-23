package com.devsuperior.dslist.dto;  //classe para pegar dados especificos de game

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String ShortDescription;
	
	//repository é o objeto responsável por fazer consultas ao banco de dados
	//JPA REPOSITORY interface
	public GameMinDTO() {
		
		
	}

	public GameMinDTO(Game entity) {  //contrutor que recebe a entidade    ctrl + O            
		//using field
		id = entity.getId(); //pega o idd da entidade e salva no id do dto 
		title = entity.getTitle();
		year = entity.getYear(); //Não precisa this. porque nao tem um parametro com mesmo nome
		imgUrl = entity.getImgUrl();
		ShortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return ShortDescription;
	}
	
	
}
