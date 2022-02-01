import java.util.Scanner;

public class Compra {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el total de la compra: ");
		int totalCompra = sc.nextInt();
		double descuento = 0d;
		
		if(totalCompra > 0 && totalCompra < 1000) {
			System.out.println("Lo siento, no hay descuento.");
		} else if(totalCompra >= 1000 && totalCompra < 5000) {
			descuento = .1d;
		} else if (totalCompra >= 5000 && totalCompra < 10000) {
			descuento = .2d;
		} else if (totalCompra >= 10000) {
			descuento = .3d;
		}
		
		System.out.println("Tienes un descuento del " + (descuento * 100) + "%" + "\nEl precio final por pagar es: " + "$" + (totalCompra - totalCompra * descuento));
	}
}
