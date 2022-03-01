package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salon")
public class SalonModel {
	
	@Id
	// Valor autogenerado
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	// Afecta solo a "id"
	@Column(unique = true, nullable = false)
	private Integer id;
	
	// Nota: El l�mite de caracteres en una base de datos es 256. 
	@Column(name = "materia", nullable = false, length = 120)
	private String materia;
	
	@Column(name = "maestro", nullable = false, length = 120)
	private String maestro;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String getMaestro() {
		return maestro;
	}
	public void setMaestro(String maestro) {
		this.maestro = maestro;
	}
	@Override
	public String toString() {
		return "SalonModel [id=" + id + ", materia=" + materia + ", maestro=" + maestro + "]";
	}
	
	
}