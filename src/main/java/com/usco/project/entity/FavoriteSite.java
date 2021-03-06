package com.usco.project.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//Tabla que almacena los sitios favoritos de los usuarios
@Entity
@Table(name="FavoriteSite")
public class FavoriteSite implements Serializable{

	private static final long serialVersionUID = 1L;

	// id del sitio favorito, autogenerado
	@Id
	@GeneratedValue
	@Column(name="id", unique=true)
	private long id;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private Site site;
	
	@JoinColumn(nullable=false)
	@ManyToOne
	private User user;
	
	
	
	public FavoriteSite() {
		
	}

	//Metodos getters y setters 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
	
	
}
