import java.util.Scanner;

public class Triangulo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Lado a: ");
		int a = in.nextInt();
		
		System.out.println("Lado b: ");
		int b = in.nextInt();
		
		System.out.println("Lado c: ");
		int c = in.nextInt();
		
		if(a < b + c && b < a + c && c < a + b) {
			System.out.println("Triángulo válido.");
		}else {
			System.out.println("Triángulo no válido.");
		}
		
		if(a == b && a == c) {
			System.out.println("Triangulo equilatero.");
		}else if(a == b || a == c || b == c){
			System.out.println("Triangulo isosceles.");
		}else {
			System.out.println("Triangulo escaleno.");
		}
	}
}
