import java.util.Scanner;

public class Divisible {
	
	public static void main(String[] args) {
		int x;
		int y;
		
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Escriba un numero x: ");
		x = teclado.nextInt();
		
		System.out.println("Escriba un numero y: ");
		y = teclado.nextInt();
		
		if(x % y == 0) {
			System.out.println("El numero " + x + " es divisible entre " + y + ".");
		}else {
			System.out.println("El numero " + x + " no es divisible entre " + y + ".");
		}
		teclado.close();
	}
}
