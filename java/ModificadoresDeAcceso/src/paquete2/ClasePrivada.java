package paquete2;

public class ClasePrivada {
	// atributos
	private String nombre; 
	private int edad;
	
	// método sett, modifica o fija un valor
	public void setSaludar(String nombre) {
		this.nombre = nombre;
	}
	
	// método get, manda información privada al exterior
	public String getSaludar() {
		// Aunque no es necesario especificar en este caso el "this", peroe s una buena práctica.
		// Para saber a qué variable hace referencia, podemos presionar ctrl y acercar el cursor para que se despliegue el mensaje + click. 
		return this.nombre;
	}
}
