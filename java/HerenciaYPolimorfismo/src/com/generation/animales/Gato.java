package com.generation.animales;

public class Gato extends Animal implements Mascota, Jugar{
	
	@Override
	public void jugar() {
		System.out.println("Estoy jugando con una caja");
	}

	@Override
	public void correr() {
		System.out.println("Estoy persiguiento una luz");
		
	}

	@Override
	public void baniar() {
		System.out.println("No me gusta el agua :(");
	}
}
