package arrreglos;

import java.util.Scanner;

public class ManipularArreglo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[] {1, 6, 45, 53, 80, 102, 145, 326, 450, 892};
		int totalPares = 0;
		int totalImpares = 0;

		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				totalPares += numeros[i];
			} else {
				totalImpares += numeros[i];
			}
		}

		System.out.println("Suma total números pares: " + totalPares);
		System.out.println("Suma total números impares: " + totalImpares);

		sc.close();
	}
}