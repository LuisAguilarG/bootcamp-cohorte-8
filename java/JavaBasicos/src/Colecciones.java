import java.util.HashSet;
import java.util.Set;

public class Colecciones {
	public static void main(String[] args) {
		
		// https://www.ecured.cu/Estructura_de_datos
		
		// Las colecciones nos sirven para almacenar un conjunto
		// de objetos
		
		// La diferencia entre colecciones y arreglos:
		// Las colecciones son din�micas, podemos argegar y remover elementos por lo que puede crecer.
		
		// Hay 3 tipos de implementaciones en "Set".
		//  Caracter�stica de todos los "set". No puede contener elementos repetidos
		
		// HashSet
		// Caracter�stica solo de HashSet: Los elementos no mantienen un orden
		// PUede ser m�s r�pida para b�squedas de elementos
		/*
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sand�a");
		frutas.add("mamey");
		frutas.add("fresa");
		*/
		
		// Utilizamos el hashset cuando queramos recuperar elementos rapidamente y no nos importe el �rden.
		// A cada elemento de frutasm as�gnalo a la variable fruta de tipo string.
		// for(tipoDeDatoElemento variable: elementoARecorrer)
		
		/*
		for( String fruta : frutas) {
			System.out.println(fruta); // Imprime los elementos, pero no en el mismo orden de inserci�n. 
		}
		*/
		
		// TreeSet
		Set<String> frutas = new HashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sand�a");
		frutas.add("mamey");
		frutas.add("fresa");
		
		for( String fruta : frutas) {
			System.out.println(fruta); // Imprime los elementos, pero no en el mismo orden de inserci�n. 
		}
		
		//  
		
		
		
		
	}
}
