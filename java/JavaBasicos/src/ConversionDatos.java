
public class ConversionDatos {
	public static void main(String[] args) {
		
		// Siempre que la conversión se haga hacia arriba (de un tipo de dato más pequeño en uno más grande) no habrá ningún problema.
		
		byte numeroByte = 10;
		
		// Conversión automática, no da ningún error. 
		short numeroShort = numeroByte;
		
		int numeroInt = numeroShort; 
		
		long numeroLong = numeroInt;
		
		
		// Como el tipo de dato long es más grande que int, es necesario realizar una conversión previa a la asignación. En javascript seía similar al parse. 
		int otroInt = (int) numeroLong;
		
		short numero1 = 123;
		short numero2 = 7343;
		
		//Daría error, ya que está trabajando con tipos de datos int al sumar, que ya no caben en el short. 
		// short suma = numero1 + numero2;
		
		// Esto sería correcto, primero se realiza la suma con la conversión interna (int) que hace java y luego el resultado se vuelve short.
		short suma = (short) (numero1 + numero2);
		
		byte numero3 = 12;
		byte numero4 = 33;
		
		// También se comprueba aquí que cuando se hagan operaciones aritméticas, Java utilizará Int a menos que indiquemos lo contrario. 
		byte suma2 = (byte) (numero3 + numero4);
		
		int suma3 = (numero3 + numero4);
		short suma4 = (short) (numero1 + numero3);
		
		
		
		
		
		
		
	}
}
