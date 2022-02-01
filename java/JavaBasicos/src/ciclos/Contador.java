package ciclos;

public class Contador {
	public static void main(String[] args) {
		
		/*
		Crea una clase llamada contador
		Escribe un ciclo que haga que un contador vaya de 15 a 90, contando de 3 en 3.
		*/
		 for(int i = 15; i <= 90 ; i++) {
			 if(i % 3 == 0) {
				 System.out.println("Número: " + i); 
			 }
		 }
		 
		 /*
		  for(int i = 15; i <= 90 ; i += 3) {
			  	System.out.println("Número: " + i); 
			 }	
		  */
		 
		 
	  
	}
}
