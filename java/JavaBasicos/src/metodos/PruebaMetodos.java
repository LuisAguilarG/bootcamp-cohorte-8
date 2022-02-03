package metodos;

public class PruebaMetodos {
	public static void main(String[] args) {
		// Ambas clases est�n contenidas en el paquete "metodos", por lo que puede acceder a sus clases.
		
		// Antes de poder usar un m�todo de otra clase, es necesario crear un objeto. 
		
		Metodos metodoPrueba = new Metodos();
		metodoPrueba.a = 10;
		metodoPrueba.b = 25;
		
		metodoPrueba.sumar();
		
		int resultadoSuma = metodoPrueba.sumaConRetorno();
		System.out.println(metodoPrueba.sumaConRetorno());
		System.out.println(resultadoSuma - 10);
		
		// M�todo con argumentos
		double multiplicacion = metodoPrueba.multiplicarConArgumentos(40, 20.5);
		System.out.println("El resultado de multiplicaci�n es " + multiplicacion);
		
		// Invocaci�n de m�todo est�tico. No requiere de un objeto. 
		Metodos.imprimirNombre("Luis");
	}
}
