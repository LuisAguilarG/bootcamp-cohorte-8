import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*
		   * Pedir al usuario 2 números por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) División
		   * 4) Multiplicación
		   * 
		   * y despues imprimir el resultado
		   */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Qué operación deseas realizar? \nSuma \nResta \nDivisión  \nMultiplicación \n");
		String opcion = sc.nextLine();
		System.out.println("Escribe el primer número: ");
		int n1 = sc.nextInt();
		System.out.println("Escribe el segundo número: ");
		int n2 = sc.nextInt();
		int resultado = 0;
		sc.close();
		
		switch (opcion.toLowerCase()) {
			case "suma":
				resultado = n1 + n2;
				break;
			case "resta":
				resultado = n1 - n2;
				break;
			case "división":
				resultado = n1 / n2;
				break;
			case "multiplicación":
				resultado = n1 * n2;
				break;
			default:
				System.out.println("La opción elegida no es válida. Intenta de nuevo. ");
		}
		
		System.out.println("El resultado de la operación: " + opcion + " es " + resultado);
	
	}
}
