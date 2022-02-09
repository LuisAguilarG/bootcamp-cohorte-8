package com.gatitos;

public class Gato {
	// atributos
	// Al no escribir un modificador de acceso, autom�ticamente se asigna el tipo "default".
	// Actualizaci�n, se cambi� a private
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	// Constructor
	public Gato(String nombre, int patas, boolean adoptado) {
		this.nombre = nombre;
		this.patas = patas;
		this.adoptado = adoptado;
	}
	
	// Getters y setters
	// Deben ser p�blicos, por convenci�n. 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}
	
	public void setPatas(int patas) {
		if(patas >= 0 && patas <= 4) {
			this.patas = patas;
		} else { // Excepciones
			throw new IllegalArgumentException("El numeor de patas no es v�lido");
		}
	}
	
	public int getPatas() {
		return this.patas;
	}
	
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	// Cuando se trabaja con booleanos, es preferible que est� de la siguiente forma:
	public boolean isAdoptado() { // "isAdoptado", como si se hiciera una pregunta
		return this.adoptado;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
}
