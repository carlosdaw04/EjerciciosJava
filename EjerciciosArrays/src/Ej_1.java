import java.util.Random;
import java.util.Scanner;

public class Ej_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n ;
		do {
			System.out.println("Escribe el tamaño del vector (entre 1 y 50)");
			n = in.nextInt();
			if(n < 1 || n > 50)
				System.out.println("Tamaño incorrecto, tiene que estar comprendido entre 1 y 50");
			}while (n < 0 || n > 50);
		
		int [] vector = new int [n];
		Random r = new Random ();     
		
		
		for (int i=0; i<n; i++) {
			vector[i] = r.nextInt(201) - 100;
		}
		
		int [] vectoralreves = new int[vector.length];
		for (int i=0; i < n; i++) {
			vectoralreves[vector.length -i - 1] = vector[i];
		}

		for (int i = 0; i<n ; i++) {
			System.out.print(vector[i] + " ");

		}
		System.out.println();
		for (int i = 0; i<n ; i++) {
			System.out.print(vectoralreves[i] + " ");

		}
	}
}
	