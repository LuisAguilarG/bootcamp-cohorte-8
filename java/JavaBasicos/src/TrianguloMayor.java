import java.util.Scanner;

public class TrianguloMayor {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Qui�res comprobar si tu figura es un tri�ngulo a partir de los �ngulos?");
		float totalAngulos = 0;
		
		for(int i = 0; i < 3; i++) {
			System.out.println("�Cu�l es el grado del �ngulo " + (i+1) + "? ");
			totalAngulos += sc.nextFloat();
		}
		System.out.println(totalAngulos);
		
		if(totalAngulos == 180.0f) {
			System.out.println("�Felicidades, tu figura S� es un tri�ngulo y los �ngulos forman en total: " + totalAngulos + "� ");
		} else {
			System.out.println("Lo lamento, tu figura NO es un tri�ngulo. Los �ngulos forman en total: " + totalAngulos + "�" + " Intenta de nuevo.");
		}
	}
}
