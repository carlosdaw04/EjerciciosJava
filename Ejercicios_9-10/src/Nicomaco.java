import java.util.Scanner;

public class Nicomaco {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Escribe la cantidad de numeros cubos: ");
		int n = in.nextInt();
		int sgteImpar = 1;

		for (int i = 1; i <= n; i++) {
			int acumulador = 0;
			if(i == n) {
			System.out.print(i + "^3 =  ");
			}
			for (int j = 1; j <= i; j++) {
				if (i == n) {
					if (j != i) {
						System.out.print(sgteImpar + " + ");
					} else {
						System.out.print(sgteImpar);
					}
				}
				acumulador += +sgteImpar;
				sgteImpar += 2;
				
			}
			
			if(i == n) {
			System.out.println(" = " + acumulador);
			}

		}
	}
}
