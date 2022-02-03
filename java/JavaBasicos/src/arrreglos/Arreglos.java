package arrreglos;

public class Arreglos {
	public static void main(String[] args) {
		// Solo un tipo de dato
		// Especificar el tamaño o la cantidad de elementos que va a contener
		// En java un arreglo no es un dato primitivo. ES un objeto, por lo que hay que inicializarlo. 
		// Nota: Los arreglos no pueden cambiar su tamaño en Java, siempre tendrán el mismo. 

		// 1 manera
		int numeros[];
		numeros = new int[4];// Especificar el número de elementos

		// Nota: Los corchetes se pueden poner delante del nombre de la variable o delante del tipo de dato.

		// 2 manera
		String[] nombres = new String[5]; // 5 elementos, pero solo 4 utilizados. Posiciones: 0, 1, 2, 3. 

		// 3 manera
		// array literal
		String []nombreFrutas = new String[] {"Manzana", "Platano", "Uva", "Pera"};

		numeros[0] = 10; 
		numeros[1] = 8; 
		numeros[2] = 100; 
		numeros[3] = 200; 
		// numeros[4] = 200;  Daría error durante tiempo de ejecución. 

		nombres[0] = "Juan";
		nombres[1] = "Pedro";
		nombres[2] = "Antonio";
		nombres[3] = "Felipe";

		System.out.println(numeros[0]);
		System.out.println(numeros[1]);

		// Imprime la dirección de memoria, ya que es un objeto. 
		System.out.println(numeros); // [I@379619aa

		for(int i = 0; i < numeros.length; i++) { // En arrays, length es una propiedad, no un método. 
			System.out.println("Elementos de números " + numeros[i]); // [0], [1]
			System.out.println("Elemento de nombres " + nombres[i]);
			System.out.println("----------------------------");

		}
	}
}