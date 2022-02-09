package com.generation;

public class Triangulo extends FiguraGeometrica{

	public Triangulo() {
		super("Triangulo");
	}
	
	@Override
	// Polimorfismo. Reescribe el m�todo que hered� de "FiguraGeometrica"
	public float calcularArea() {
		return (getAlto() * getLargo()) / 2;
	}
	
	@Override
	public float calcularPerimetro() {
		return 0;
	}
}

