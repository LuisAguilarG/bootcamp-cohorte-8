
public class ConversionDatos {
	public static void main(String[] args) {
		
		// Siempre que la conversi�n se haga hacia arriba (de un tipo de dato m�s peque�o en uno m�s grande) no habr� ning�n problema.
		
		byte numeroByte = 10;
		
		// Conversi�n autom�tica, no da ning�n error. 
		short numeroShort = numeroByte;
		
		int numeroInt = numeroShort; 
		
		long numeroLong = numeroInt;
		
		
		// Como el tipo de dato long es m�s grande que int, es necesario realizar una conversi�n previa a la asignaci�n. En javascript se�a similar al parse. 
		int otroInt = (int) numeroLong;
		
		short numero1 = 123;
		short numero2 = 7343;
		
		//Dar�a error, ya que est� trabajando con tipos de datos int al sumar, que ya no caben en el short. 
		// short suma = numero1 + numero2;
		
		// Esto ser�a correcto, primero se realiza la suma con la conversi�n interna (int) que hace java y luego el resultado se vuelve short.
		short suma = (short) (numero1 + numero2);
		
		byte numero3 = 12;
		byte numero4 = 33;
		
		// Tambi�n se comprueba aqu� que cuando se hagan operaciones aritm�ticas, Java utilizar� Int a menos que indiquemos lo contrario. 
		byte suma2 = (byte) (numero3 + numero4);
		
		int suma3 = (numero3 + numero4);
		short suma4 = (short) (numero1 + numero3);
		
		
		
		
		
		
		
	}
}
