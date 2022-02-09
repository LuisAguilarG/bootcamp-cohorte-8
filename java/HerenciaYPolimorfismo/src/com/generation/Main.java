package com.generation;

public class Main {

	public static void main(String[] args) {

		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.setAlto(10);
		cuadrado1.setLargo(cuadrado1.getAlto());
		System.out.println("El área del " + cuadrado1.getNombre() + " es " + cuadrado1.calcularArea());
		
		Triangulo triangulo1 = new Triangulo();
		triangulo1.setAlto(10);
		triangulo1.setLargo(15);
		System.out.println("El área del " + triangulo1.getNombre() + " es " + triangulo1.calcularArea());
		
	}

}
