package com.generation;

public class Tacos {
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortilla;
	// Evitar el uso de caracteres especiales como "�".
	private String tamanioDeTortilla;
	private float precio = 0.0f; // Lo definimos desde el inicio para evitar un error futuro al subir el precio.
	
	// Sobrecarga de m�todo. Dependiendo del tipo de datos que reciba un m�todo, se seleccionar� una versi�n u otra.
	// Esta opci�n es un constructor sin par�metros
	public Tacos() {
		
	}
	
	// Constructor con solo un tipo de dato como par�metro
	/* 
	public Tacos(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	*/
	
	// Constructor: m�todo especial para inicializar objetos
	/*
	public Tacos(String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
		// This hace referencia al atributo de la clase y la otra variable despu�s del igual hace referencia al par�metro que recibe el m�todo.
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
	
	// Para crearlo, click derecho al final del c�digo.
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
			throw new IllegalArgumentException("El precio de taco no es v�lido");
		}
	}

	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
}
	