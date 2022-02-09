package com.gatitos;

public class PruebaGato {
	public static void main(String[] args) {
		Gato g = new Gato("Taco", 4, false);
		
		/*
		g.nombre = "Taco";
		g.patas = 3;
		*/ 
		// Automáticamente llama al método toString
		// System.out.println(g);
		// Salida: Gato [nombre=Taco, patas=3]
		
		g.setNombre("Taco");
		// g.setPatas(6); Daría un error en tiempo de ejecución
		g.setPatas(4);
		g.setAdoptado(false);
		
		// Para recuperar los atributos e imprimirlos
		
		// Forma 1
		System.out.println(g.toString());
		
		// Forma 2
		System.out.println("Mi gato se llama " + g.getNombre() + "\nTiene " + g.getPatas() + " patas" + "\n¿Es adoptado? " + g.isAdoptado());
	}
}
