import java.util.Scanner;

public class EscribirTriangulos {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		
		for (int i = 1; i <=10; i++) {
			int n = i % 10;
			int espacios = 10 - 1;
			int digitos = i + i - 1;
			
			for(int j = 0; j < espacios; j++) {
				System.out.print(" ");
			}
			
			for(int h = 0; h < digitos; h++) {
				System.out.print(digitos);
			}
			
			System.out.println();
		}
	}
}
