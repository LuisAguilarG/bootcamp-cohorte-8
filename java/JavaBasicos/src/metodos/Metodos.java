package metodos;

public class Metodos {
	// Un método es una función
	
	// Atributos de la clase
	int a, b;
	
	// Método void (vacío)
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " más " + b + " es " + resultado);
	}
	
	// Método con valor de retorno
	public int sumaConRetorno() {
		
		// Forma 1
		// int resultado = a + b; 
		// return resultado; 
		
		// Forma 2
		return a + b;
	}
	
	// Argumentos
	// suma(argumentos)
	
	public double multiplicarConArgumentos(int arg1, double arg2) {
		int c = arg1;
		double d = arg2;
		
		return c * d;
	}
	
	// Método estático
	// Un método estático se peude invocar sin la necesidad de haber creado un objeto. 
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
	
}
