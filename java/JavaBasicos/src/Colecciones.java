import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Colecciones {
	public static void main(String[] args) {
		
		// Orden en velocidad: HashSet, LinkedHashSet y TreeSet. 
		
		// Nota: "List" y "Set" son dos subclases de Collection. 
		// En la lista, los datos est�n un orden particular. 
		// En Set, no puede contener los mismos datos dos veces.
		// En Collection, solo almacena datos sin un orden particular y puede contener datos duplicados. 
		
		// https://www.ecured.cu/Estructura_de_datos
		
		// https://www.adictosaltrabajo.com/2015/09/25/introduccion-a-colecciones-en-java/
		
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
		frutas.add("mango"); // COmo ya se hab�a agregado anteriormente, no se vuelve a agregar. 
		*/
		
		// Utilizamos el hashset cuando queramos recuperar elementos rapidamente y no nos importe el �rden.
		// A cada elemento de frutasm as�gnalo a la variable fruta de tipo string.
		// for(tipoDeDatoElemento variable: elementoARecorrer)
		
		/*
		for( String fruta : frutas) {
			System.out.println(fruta); // Imprime los elementos, pero no en el mismo orden de inserci�n. 
		}
		*/
		
		// -----------------------------------------------------
		
		// TreeSet
		// Esta implementaci�n ordena los eleentos en funci�n de sus valores
		// Es la impementaci�n mas lenta.
		// Los ordena alfabeticamente
		// May�sculas ir�n antes que min�sculas. 
		
		/*
		Set<String> frutas = new TreeSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("Sand�a"); // May�scula
		frutas.add("mamey");
		frutas.add("fresa");
		
		for( String fruta : frutas) {
			System.out.println(fruta); // Imprime los elementos, pero no en el mismo orden de inserci�n. 
		}
		*/
		
		
		//LinkedHashSet
		// Ordena los elementos por orden de inserci�n
		// Es m�s costoso que HashSet
		
		/*
		Set<String> frutas = new LinkedHashSet<String>();
		frutas.add("mango");
		frutas.add("granada");
		frutas.add("pi�a");
		frutas.add("sand�a"); 
		frutas.add("mamey");
		frutas.add("fresa");
		
		for( String fruta : frutas) {
			System.out.println(fruta); // Imprime los elementos, pero no en el mismo orden de inserci�n. 
		}
		
		*/
		
		// ------------------------------------------
		
		// List
		// Se permiten elementos duplicados
		// Acceder a elementos espec�ficos
		// Buscar elementos
		
		// ArrayList
		
		List<String> pokemones = new ArrayList<String>();
		pokemones.add("Chicorita");	// indice 0	
		pokemones.add("Eevee");		// indice 1
		pokemones.add("Psyduck");		// indice 3
		pokemones.add("Dragonite");		// indice 4
		pokemones.add("Charizard");	// indice 5
		pokemones.add("Gengar"); // indice 6
		pokemones.add("Gengar"); // indice 7
		
		
		pokemones.add(2, "Pikachu"); // Inserta el elemento en el �ndice 2 ( Psyduck) y todos los dem�s los desplaza. NO lo remplaza. 
		
		for(String pokemon: pokemones) {
			System.out.println(pokemon);
		}
		
		System.out.println("***************");
		System.out.println(pokemones.get(0)); // Elemento para obtener elementos seg�n la posici�n. Es algo que en "Set" no se tiene, 
		
		// indexOf, nos va a devolver la posici�n del elemento
		// y si el eleento no se encuentra nos devuelve -1
		// Si tenemos elementos repetidos, al utilizar el "indexOf" nos regresar� la posici�n del primer elemento que coincida, no de todos. 
		
		System.out.println(pokemones.indexOf("Gengar")); // 6
		System.out.println(pokemones.lastIndexOf("Gengar")); // 7 
		System.out.println(pokemones.indexOf("Togepi")); // COmo no existe, regresa -1
		
		// Remueve e elemento de la posici�n especificada
		pokemones.remove(5);
		
		// set remplaza el elemento en la posici�n especificada
		pokemones.set(0, "Flareon");
		
		System.out.println("*********************");
		
			
		
		// LinkedList
		// Lista doblemente enlazada 
		// Patamon sabe que est� delante de agum�n y detr�s de Angemon
		// Los m�todos anteriores tambi�n funcionan (add, remove, etc)
		List<String> digimones = new LinkedList<String>();
		digimones.add("Agumon");
		digimones.add("Patamon");
		digimones.add("Angemon");
		digimones.add("Andromon");
		
		
		
		// Map
		// Asocia claves a valores
		// No puede contener claves duplicadas
		// Solo puede tener un valor asociado
		
		// HashMap
		// Tiene mejor rendmiento pero no garantiza un orden
		// a la hora de hacer iteraciones
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		usuarios.put(115, "Carlos Eduardo");
		usuarios.put(2202, "Raul");
		usuarios.put(301, "Ro");
		
		// Acceder solo a un elemento en particular
		System.out.println(usuarios.get(301));
		
		// keyset
		// Nos permite recuperar el nombre de la clave
		System.out.println(usuarios.keySet());
		
		// values
		// Nos permite recuperar el valor directamente
		System.out.println(usuarios.values());
		
		
		// TreeMap
		Map<Integer, String> tamales = new TreeMap<Integer, String>();
		tamales.put(5, "Mole Rojo" );
		tamales.put(9, "Mole verde");
		tamales.put(160, "Gansito");
		tamales.put(1, "Cochinita");
		
		System.out.println("*********************");
		System.out.println(tamales.keySet());
		System.out.println(tamales.values());
		
		System.out.println(tamales);
		
		tamales.entrySet().forEach(elemento -> { // Funci�n lambda
			System.out.println(elemento.getKey().toString() + " " + elemento.getValue().toString());
			System.out.println(elemento);
		});
		
		
		// LinkedHashMap
		Map<Integer, String> carros = new LinkedHashMap<Integer, String>();
		carros.put(1, "Volvo");
		carros.put(145, "Pointer");
		carros.put(61, "Mustang");
		
		System.out.println(carros.keySet());
		System.out.println(carros.values());
	}
}
