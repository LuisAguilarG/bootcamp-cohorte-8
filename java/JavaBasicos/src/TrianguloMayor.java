import java.util.Scanner;

public class TrianguloMayor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Quiéres comprobar si tu figura es un triángulo a partir de los ángulos?");
		float totalAngulos = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("¿Cuál es el grado del ángulo " + (i+1) + "? ");
			totalAngulos += sc.nextFloat();
		}
		System.out.println(totalAngulos);
		
		if(totalAngulos == 180.0f) {
			System.out.println("¡Felicidades, tu figura SÍ es un triángulo y los ángulos forman en total: " + totalAngulos + "° ");
		} else {
			System.out.println("Lo lamento, tu figura NO es un triángulo. Los ángulos forman en total: " + totalAngulos + "°" + " Intenta de nuevo.");
		}
	}
}
