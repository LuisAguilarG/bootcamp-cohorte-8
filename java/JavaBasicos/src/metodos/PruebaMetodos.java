package metodos;

public class PruebaMetodos {
	public static void main(String[] args) {
		// Ambas clases están contenidas en el paquete "metodos", por lo que puede acceder a sus clases.
		
		// Antes de poder usar un método de otra clase, es necesario crear un objeto. 
		
		Metodos metodoPrueba = new Metodos();
		metodoPrueba.a = 10;
		metodoPrueba.b = 25;
		
		metodoPrueba.sumar();
		
		int resultadoSuma = metodoPrueba.sumaConRetorno();
		System.out.println(metodoPrueba.sumaConRetorno());
		System.out.println(resultadoSuma - 10);
		
		// Método con argumentos
		double multiplicacion = metodoPrueba.multiplicarConArgumentos(40, 20.5);
		System.out.println("El resultado de multiplicación es " + multiplicacion);
		
		// Invocación de método estático. No requiere de un objeto. 
		Metodos.imprimirNombre("Luis");
	}
}
