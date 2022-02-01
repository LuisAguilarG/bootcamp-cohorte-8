import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		/*
		   * Pedir al usuario 2 n�meros por consola y preguntarle que desea realizar
		   * 1) Suma
		   * 2) Resta
		   * 3) Divisi�n
		   * 4) Multiplicaci�n
		   * 
		   * y despues imprimir el resultado
		   */

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Qu� operaci�n deseas realizar? \nSuma \nResta \nDivisi�n  \nMultiplicaci�n \n");
		String opcion = sc.nextLine();
		System.out.println("Escribe el primer n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Escribe el segundo n�mero: ");
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
			case "divisi�n":
				resultado = n1 / n2;
				break;
			case "multiplicaci�n":
				resultado = n1 * n2;
				break;
			default:
				System.out.println("La opci�n elegida no es v�lida. Intenta de nuevo. ");
		}
		
		System.out.println("El resultado de la operaci�n: " + opcion + " es " + resultado);
	
	}
}
