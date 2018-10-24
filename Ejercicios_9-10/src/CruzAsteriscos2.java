import java.util.Scanner;

public class CruzAsteriscos2 {
	
	static int obtenerFC(String fc) {
		Scanner in = new Scanner(System.in);
		int n;
		do {
			System.out.println("Numero de " + fc + ": ");
			n = in.nextInt();
			if (n < 3 || n % 2 == 0) {
				System.out.println("Numero de " + fc + " incorrecto. Vuelva a introducir.");
			}
		} while (n < 3 || n % 2 == 0);
		
		return n;
	}
	
	public static void main(String[] args) {
		int n = obtenerFC("filas");
		int m = obtenerFC("columnas");
	}
}
