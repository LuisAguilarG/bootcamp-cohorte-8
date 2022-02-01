package ciclos;

public class Ciclos {
	// Para crear un "Break point", hay que dar doble clik en la barra de desplazamiento izquierda. FUncionará durante debug. 
	// Con f6 permitimos que avance el programa
	// Para abrir sugerencias e insertar el main: presionar ctrl + espacio
	
	public static void main(String[] args) {
		// while
		
		/*
		int control = 0;
		
		// Iteraciones
		while(control < 10) {
			System.out.println("Control = " + control);
			control++;
		}
		*/
		
		// do while
		int control = 0;
		do {
			System.out.println("Control = " + control);
			control++;
		} while(control < 10);
		
		
		// for 
		// Break y continue
		 for(int i = 0; i < 10 ; i++) {
			 if(i % 2 == 0) {
				 System.out.println("Control = " + i);
				 continue; //  Solo salta la iteración actual y continúa a la siguiente
				 // break; // Termina / Sale completamente del blucle 
			 }
			 System.out.println("Hola"); // NO se ejecuta 
		 }
		 
		 for (int i = 0; i < 3; i++) {
			 System.out.println("Control = " + i);
			 continue;  
		 }
	}
}
