package ciclos;

import java.util.Scanner;

public class DeletreaNombre {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe tu nombre: ");
		String nombre = sc.nextLine();
		int longitudNombre = nombre.length();

		System.out.println("Tu nombre es: ");
		for(int i = 0; i < longitudNombre; i++) {
			System.out.println(nombre.charAt(i));
		}


		System.out.println("Tu nombre al revés es: ");
		for(int i = longitudNombre; i > 0; i--) {
			System.out.println(nombre.charAt(i-1));
		}

		sc.close();
	}
}