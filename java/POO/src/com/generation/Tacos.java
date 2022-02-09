package com.generation;

public class Tacos {
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	// Evitar el uso de caracteres especiales como "ñ".
	private String tamanioDeTortilla;
	private float precio = 0.0f; // Lo definimos desde el inicio para evitar un error futuro al subir el precio.
	
	// Sobrecarga de método. Dependiendo del tipo de datos que reciba un método, se seleccionará una versión u otra.
	// Esta opción es un constructor sin parámetros
	public Tacos() {
		
	}
	
	// Constructor con solo un tipo de dato como parámetro
	/* 
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	*/
	
	// Constructor: método especial para inicializar objetos
	/*
	public Tacos(String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
		// This hace referencia al atributo de la clase y la otra variable después del igual hace referencia al parámetro que recibe el método.
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	*/ 
	
	void preparar() {
		System.out.println("Preparando tu rico taco");
	}

	void vender() {
	System.out.println("Taco vendido");
	}

	void ponerSalsa() {
	System.out.println("Agregando salsa de la que no pica");
	}
	
	// Para crearlo, click derecho al final del código.
	// Source -> Generate toString()
	// Seleccionar todo -> Generate
	
	/*
	void subirPrecio(float aumento) {
		precio += aumento;
	}
	*/
	
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getTipoDeGuisado() {
		return tipoDeGuisado;
	}

	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}

	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		if(precio > 0 && precio <= 50) {
			this.precio = precio;
		} else { // Excepciones
			throw new IllegalArgumentException("El precio de taco no es válido");
		}
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
}
	