import java.util.Scanner;

public class ParInpar {

	public static void main(String[] args) {
		int a;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba un numero: ");
		a = teclado.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("El numero " + a + " es par.");
		}else {
			System.out.println("El numero " + a + " es impar.");
		}
		teclado.close();
	}
}
