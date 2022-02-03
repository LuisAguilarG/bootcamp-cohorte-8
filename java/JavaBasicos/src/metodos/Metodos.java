package metodos;

public class Metodos {
	// Un m�todo es una funci�n
	
	// Atributos de la clase
	int a, b;
	
	// M�todo void (vac�o)
	public void sumar() {
		int resultado = a + b;
		System.out.println("El resultado de sumar " + a + " m�s " + b + " es " + resultado);
	}
	
	// M�todo con valor de retorno
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
	
	// M�todo est�tico
	// Un m�todo est�tico se peude invocar sin la necesidad de haber creado un objeto. 
	public static void imprimirNombre(String nombre) {
		System.out.println("Mi nombre es: " + nombre);
	}
	
}
