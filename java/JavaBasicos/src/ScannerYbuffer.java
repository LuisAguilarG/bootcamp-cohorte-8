import java.util.Scanner;

public class ScannerYbuffer {
	public static void main(String[] args) {
		
		// Nota: sc.next() deja de leer cuando encuentre un espacio en la entrada.
		// Podemos utilizar "sc.nextLine()" para limpiar el buffer.
		
				
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int numero1 = sc.nextInt();		
		System.out.println("Introduce otro número: ");
		int numero2 = sc.nextInt();
		
		System.out.println("Número 1: " + numero1 + " Número 2: " + numero2);
		
		// Cerrar Scanner cuando a no se va a utilizar más en el programa.
		sc.close();
		
		// SI se cierra un scanner, no se puede utilizar y se tiene que crear otor objeto. 
		
	}
}
