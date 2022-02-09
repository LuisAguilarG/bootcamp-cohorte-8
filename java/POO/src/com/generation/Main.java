package com.generation;

public class Main {

	public static void main(String[] args) {
		
		// Tacos taco1 = new Tacos("Masa azul", "Suadero", 2, "Mediana", 30);
		
		/*
		Tacos taco1 = new Tacos(); // Declara una variable de tipo "Taco" y la inicializa en la misma instrucción.
		taco1.tipoDeTortilla = "Masa azul";
		taco1.tipoDeGuisado = "Suadero";
		taco1.numeroDeTortilla = 2;
		taco1.tamanioDeTortilla = "Mediana";
		taco1.precio = 30;
		taco1.subirPrecio(5.5f);
		*/
		
		/*
		System.out.println(taco1.toString());
		 
		Tacos taco2 = new Tacos();
		taco2.tipoDeTortilla = "Harina";
		taco2.tipoDeGuisado = "Bisteck";
		taco2.numeroDeTortilla = 1;
		taco2.tamanioDeTortilla = "Grande";
		taco2.precio = 42.6f;
		taco2.tipoDeTortilla = "Trigo";
		System.out.println(taco2.toString());
		
		
		Tacos taco3 = new Tacos("Maíz");
		System.out.println(taco3.toString());
		
		System.out.println(taco1);
		System.out.println(taco2);
		System.out.println(taco3);
		*/
		
		// Modificaciones después de encapsular la clase "Tacos".
		// Para fines prácticos, solo el "setPrecio" tiene un excepción. Sin embargo, todos los setters deberían llevarlo. 
		Tacos tacoEncapsulado = new Tacos();
		tacoEncapsulado.setNumeroDeTortilla(2);
		tacoEncapsulado.setPrecio(13);
		tacoEncapsulado.setTamanioDeTortilla("Chica");
		tacoEncapsulado.setTipoDeGuisado("Pastor");
		tacoEncapsulado.setTipoDeTortilla("Maíz");
		
		System.out.println(tacoEncapsulado.toString());
	}
}
