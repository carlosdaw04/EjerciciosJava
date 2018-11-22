import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero (entre 10 - 1.000.000): ");
		int n;
		do {
			n = sc.nextInt();
			if (n < 10 || n > 1000000) {
				System.out.println("Numero incorrecto. Intentelo otra vez (entre 10 - 1000000): ");
			}
			
		}while (n < 10 ||n > 1000000);
		
		int[] vector = new int[n];
		Random r = new Random();
		
		for(int i = 0; i < n; i++) {
			vector[i] = r.nextInt(100) - 100;
		}
	
		if (n <= 20) {
			for (int i = 0; i < n; i++) {
				System.out.print(vector[i] + " ");
			}
		}
	}
}
