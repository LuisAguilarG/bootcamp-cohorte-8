package paquete2;

public class ClasePrivada {
	// atributos
	private String nombre; 
	private int edad;
	
	// m�todo sett, modifica o fija un valor
	public void setSaludar(String nombre) {
		this.nombre = nombre;
	}
	
	// m�todo get, manda informaci�n privada al exterior
	public String getSaludar() {
		// Aunque no es necesario especificar en este caso el "this", peroe s una buena pr�ctica.
		// Para saber a qu� variable hace referencia, podemos presionar ctrl y acercar el cursor para que se despliegue el mensaje + click. 
		return this.nombre;
	}
}
