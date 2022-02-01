import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3]; 
		int numeroMayor = 0;
		System.out.println("Este programa te ayudará a encontrar el número mayor de un conjunto");
		for(int i = 0; i < 3; i++) {
			System.out.println("Introduce el número " + (i+1) + " : ");
			numeros[i] = sc.nextInt();
			
			if(numeros[i] > numeroMayor) {
				numeroMayor = numeros[i];
			}
		}
		
		System.out.println("******* Lista de números *******");
		
		// Imprime lista de números al usuario
		for(int i = 0; i < numeros.length; i++) {
			System.out.println((i+1) + ". " + numeros[i]);
		}
		
		System.out.println("El número mayor de todos es: " + numeroMayor);
		
		sc.close();
	}
}
