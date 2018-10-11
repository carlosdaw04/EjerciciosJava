import java.util.Random;

public class Comparar {
	public static void main(String[] args) {

		
		Random r = new Random(System.nanoTime());
		
		int numero1 = r.nextInt(100);
		int numero2 = r.nextInt(100);
		
		System.out.println("Numero 1: " + numero1);
		System.out.println("Numero 2: " + numero2);
		
		if (numero1 > numero2) {
			System.out.println("El numero 1 (" + numero1 + ") es mayor que el numero 2 (" + numero2 + ").");
		}else if (numero2 > numero1) {
			System.out.println("El numero 2 (" + numero2 + ") es mayor que el numero 1 (" + numero1 + ").");
		}else {
			System.out.println("Los dos numeros son iguales.");
		}
	}
}
