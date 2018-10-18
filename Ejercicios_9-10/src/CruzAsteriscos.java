import java.util.Scanner;

public class CruzAsteriscos {
	public static void main(String[] args) {
		int n;
		int m;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Numero de filas: ");
		n = in.nextInt();
		
		System.out.println("Numero de columnas: ");
		m = in.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Numero de filas incorrecto.");
		}else if (m % 2 == 0) {
			System.out.println("Numero de columnas incorrecto.");
		}
		else {
			for (int i = 0; i<n; i++) {
				if(i == n/2) {
					for(int j = 0; j<m; j++) {
						System.out.print("*");
					}
				}
				else {
					for(int j = 0; j<n; j++) {
						if(j == m/2) {
							System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}
				}
				System.out.println();
			}
		}
		
		in.close();
	}
}
