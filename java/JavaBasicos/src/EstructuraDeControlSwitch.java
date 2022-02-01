import java.util.Scanner;

public class EstructuraDeControlSwitch {
	 // Nos sirven para controlar el flujo de comportamiento de un programa. Para la toma de decisiones.
	
	
	// A diferencia del if, se evalúan casos más concretos
	/* 
	 * switch(condicion_a_evaluar) {
	 * 	case "valor": 
	 * 		codigo a ejecutar;
	 * 		break;
	 * 	case "n": 
	 * 		codigo a ejecutar;
	 * 		break;
	 * default: 
	 * 		codigo a ejecutar
	 * }
	 * 
	 */
	
	
	public static void main(String[] args) {
		// Solicitar al usuario un día d ela semana y mostrar un mensaje.
		System.out.println("Escribe un día de la semana en minúsculas ");
		Scanner sc = new Scanner(System.in);
		String dia = sc.nextLine();
		
		switch(dia.toLowerCase()) {
			case "lunes":
				System.out.println("Hoy es lunes");
				break;
			case "martes":
				System.out.println("Hoy es martes");
				break;
			case "miercoles":
				System.out.println("Hoy es miercoles");
				break;
			case "jueves":
				System.out.println("Hoy es jueves");
				break;
			case "viernes":
				System.out.println("Hoy es viernes");
				break;
			case "sabado": // No ejecuta instrucciones y pasa a domingo, ya que tampoco hay "break"
			case "domingo":
				System.out.println("Basta de trabajación");
				break;
			default:
				System.out.println("Día desconocido");
				break;
		}
	}
	
}
