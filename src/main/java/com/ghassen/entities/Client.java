package com.ghassen.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity //JPA doit avoir l'annotation Entity
public class Client implements Serializable {
// les entiters implementent toujours l'interface Serializable
	
	//pour spécifier l'identifiant(@Id), si elle est généré automatiquement on utilise @GeneratedValue
	@Id @GeneratedValue
	private Long code;
	
	private String nom;
	private String email;
	
	@OneToMany(mappedBy="cleint",fetch=FetchType.LAZY) //Association: un client peut avoir plusieurs comptes, cette relation est mappé par "cleint"
	private Collection<Compte> comptes;
	
	
	public Client() {
		super();
	}
	
	public Client(String nom, String email) {
		super();
		this.nom = nom;
		this.email = email;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
	
}
