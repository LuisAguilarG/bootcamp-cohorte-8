import java.util.Scanner;

public class NumeroMayor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[3]; 
		int numeroMayor = 0;
		System.out.println("Este programa te ayudar� a encontrar el n�mero mayor de un conjunto");
		for(int i = 0; i < 3; i++) {
			System.out.println("Introduce el n�mero " + (i+1) + " : ");
			numeros[i] = sc.nextInt();
			
			if(numeros[i] > numeroMayor) {
				numeroMayor = numeros[i];
			}
		}
		
		System.out.println("******* Lista de n�meros *******");
		
		// Imprime lista de n�meros al usuario
		for(int i = 0; i < numeros.length; i++) {
			System.out.println((i+1) + ". " + numeros[i]);
		}
		
		System.out.println("El n�mero mayor de todos es: " + numeroMayor);
		
		sc.close();
	}
}
