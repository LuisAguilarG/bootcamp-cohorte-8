package operadores;

public class Operadores {
	public static void main(String[] args) {
		
		// Operadores aritm�ticos
		// + - / * %
		
		int a = 10; 
		int b = 20;
		// int c = a + b; 
		double c = 10.0;
		System.out.println(c);
		
		// No es un dato primitivo, sino una clase
		String str1 = "El resultado de la suma es: ";
		System.out.println(str1 + c);
		
		// Resta
		System.out.println("El resultado de la resta: " + (a - b));
		
		// Divisi�n 
		// Aunque el resultado deber�a ser "0.5", al tratarse int, Java redondea el valor.
		int division = a / b;
		System.out.println("El resultado de la divisi�n es: " + division);
		
		// Imprime "0.0" porque aunque es un tipo de dato qu acepta decimales, la operaci�n antes de la asignaci�n se sigue haciendo datos enteros "int".
		double division2 = a / b; 
		System.out.println("El resultado de la divisi�n es: " + division2);
		
		// Aqu� s� se imprime el resultado correcto. Al menos uno de los datos debe ser de tipo double
		division2 = (double) a / b; 
		// 10.0 / 20 = 0.5
		System.out.println("El resultado de la divisi�n es: " + division2);
		
		// Otra forma v�lida de obtener el resultado correcto:
		division2 = c / b ;
		System.out.println("El resultado de la divisi�n es: " + division2);
		
		
		// Multiplicaci�n
		double multiplicacion = c * a; 
		System.out.println("El resultado de la divisi�n es: " + multiplicacion);
		
		// Modulo
		int modulo = a % b;
		System.out.println("El m�dulo de la operaci�n es: " + modulo);
		
		// Operador de asignaci�n 
		int d = 5, e; // Inicializar las variables vac�as
		e = 6;
		
		System.out.println(d + ", " + e);	
		System.out.println(d + e);	
		
		// Operadores de declaraci�n compuesta
		// += -= *= /= %=
		// Una operaci�n simplificada
		
		int f = 0, g= 5;
		f += 5;
		System.out.println(f);
		
		// Operadores relacionales
		// *< > <= >=
		
		// == igualdad a
		// != no igual a
		// Resultado un valor de tipo booleano
		
		int h = 15, i = 25;
		String j = "Hola";
		
		System.out.println(h > i); // false
		System.out.println(i != h);
		// System.out.println(h != j);Error
		
		// Operador unario
		/* ++ -- 
		 * Preasignaci�n
		 * Postasignaci�n
		 */
		
		int k = 0, l = 0;
		System.out.println(k++); // 0 porque primero se ejecuta el print y luego se suma 1
		k++;
		System.out.println(k); // 2 por que se le sumo 1 antes y ahora se imprime
		System.out.println(--l); //-1 porque primero se resta y luego se imprime
		
		// Precedencia de operadores
		
		// Orden: multiplicaci�n, divisi�n y suma
		int operacion = 4 + 5 * 6 / 3;
		
		System.out.println(operacion);
		
		int x = 0, y = 0;
		// Orden: ++, +, --
		int operacion2 = ++x + y--; //
		System.out.println(operacion2);
		
		// Operador ternario
		int edad = 18;
		
		// Es un if abreviado solo nos permite tomar una decisi�n
		int valor = (edad <= 18) ? 2:1;
		
		// Operadores l�gicos
		// And &&
		// or ||
		
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(true || false); // true
		System.out.println(true && !false); // true
		
		
		
		
		
		
		
	}
}
