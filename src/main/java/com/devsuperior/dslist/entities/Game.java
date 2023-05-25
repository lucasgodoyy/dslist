package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// este @ tem função de configurar para que a classe java seja uma tabela do banco relacional

@Entity 
@Table(name = "tb_game")	

public class Game {

	@Id // config id sendo chave primaria no banco
	@GeneratedValue (strategy = GenerationType.IDENTITY)     // config para o id ser auto encrementado no banco de dados
	
	private Long id;
	private String title;
	@Column(name = "game_year") //costumizando nome da tabela no banco
	
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	
	@Column (columnDefinition = "TEXT") //definindo a coluna como texto 
	private String ShortDescription;
	//instrução para jpa na horar de gerar o banco, gerar esse campo como texto e nao varchar
	
	@Column (columnDefinition = "TEXT")
	private String longDescription;
	
	
	public Game() {
		
	}


	public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
			String shortDescription, String longDescription) {

		this.id = id;  //this.id é o dado do objeto, o id resultado é o argumento que chegou no metodo entre parentes
		this.title = title; // o title objeto, recebe o title que vir de argumento do método
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		ShortDescription = shortDescription;
		this.longDescription = longDescription;
	}

// metodo get e set, get para atribuir valor e set para atualizar valor com segurança
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getYear() {
		return year;
	}


	public void setYear(Integer year) {
		this.year = year;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getPlatforms() {
		return platforms;
	}


	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}


	public Double getScore() {
		return score;
	}


	public void setScore(Double score) {
		this.score = score;
	}


	public String getImgUrl() {
		return imgUrl;
	}


	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}


	public String getShortDescription() {
		return ShortDescription;
	}


	public void setShortDescription(String shortDescription) {
		ShortDescription = shortDescription;
	}


	public String getLongDescription() {
		return longDescription;
	}


	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

//método para comparar os jogos pelo id
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
}
