package com.generation;

public class Cuadrado extends FiguraGeometrica {
	
	public Cuadrado() {
		// Constructor padre. Debe ir antes que todo lo demás. 
		// Solo se puede utilizar una vez el constructor padre por cada constructor hijo
		super("Cuadrado");
	}

	@Override
	public float calcularArea() {
		return getAlto() * getAlto();
	}
	
	@Override
	public float calcularPerimetro() {
		return getAlto() * 4;
	}
}
