import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Escribe un numero (entre 10 - 1.000.000): ");
//		int n;
//		do {
//			n = sc.nextInt();
//			if (n < 10 || n > 1000000) {
//				System.out.println("Numero incorrecto. Intentelo otra vez (entre 10 - 1000000): ");
//			}
//			
//		}while (n < 10 ||n > 1000000);
//		
//		int[] vector = new int[n];
//		Random r = new Random();
//		
//		for(int i = 0; i < n; i++) {
//			vector[i] = r.nextInt(100) - 100;
//		}
		
		int[] vector = {-7, 41, 23, 13, 2, 9, 70, -4, 5, 5, -4, -2, 10, 11, 21, 31, -31, 40, 50};
		int suma = 0;
		int parcial;
		
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] != 13) {
				suma = suma + vector[i];
			}else {
				parcial = vector[i];
				for(int j = i + 1; j < vector.length && j <= i + 13; j++) {
					parcial = parcial + vector[i];
				}
				if(parcial == 7) {
					suma = suma + parcial;
				}
				
				i = i + 13;
			}
		}
		System.out.println("Suma: " + suma);
	}
}
