package com.generation;

// Clases abstractas
// La clase abstracta no puede crear objetos
// Clases que pueden o no contener métodos abstractos
// Método abstracto es un metodo que te dice qué hacer pero no cómo
// 

public abstract class FiguraGeometrica {
	private String nombre;
	// Pueden ser protected en lugar de private para que las clases que hereden los atributos puedan utilizarlos. 
	private float alto;
	private float largo;
	
	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract float calcularArea();
	public abstract float calcularPerimetro();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getAlto() {
		return alto;
	}

	public void setAlto(float alto) {
		this.alto = alto;
	}

	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}
	
	
	
}
