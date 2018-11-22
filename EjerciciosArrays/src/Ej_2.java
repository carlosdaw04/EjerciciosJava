import java.util.Random;
import java.util.Scanner;

public class Ej_2 {
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);

		do {
			System.out.println("Escribe un numero (10 - 1.000.000): ");
			n = in.nextInt();
			if (n < 10 || n > 1000000) {
				System.out.println("Tamaño incorrecto, tiene que estar comprendido entre 1 y 50");
			}
		} while (n < 10 || n > 1000000);

		int[] vector = new int[n];
		Random r = new Random();
		long t0 = System.nanoTime();

		for (int i = 0; i < n; i++) {
			int valor;

			do {
				valor = r.nextInt(2000000) - 999999;
			} while (repetido(vector, valor, i - 1));

			vector[i] = valor;
		}

		tiempoTranscurrido("Tiempo empleado en crear el vector: ", System.nanoTime() - t0);

		for (int i = 0; i < n; i++) {
			System.out.print(vector[i] + " ");
		}
		
		System.out.println();
		
		t0 = System.nanoTime();
		
		int mayor = vector[0];
		int menor = vector[0];
		
		for (int i = 1; i < n; i++) {
			if (vector[i] > mayor) {
				mayor = vector[i];
			}
			if (vector[i] < menor) {
				menor = vector[i];
			}
		}
		
		tiempoTranscurrido("Tiempo empleado en crear el vector: ", System.nanoTime() - t0);
		
		System.out.println("El numero mayor es " + mayor);

		System.out.println("El numero menor es " + menor);
		
		System.out.println("La diferencia entre el mayor y el menor es de " + (mayor - menor));
		
		tiempoTranscurrido("Tiempo empleado en calcular la diferencia entre el menor y el mayor: ", System.nanoTime() - t0);

	}

	static boolean repetido(int[] vector, int valor, int p) {
		for (int i = 0; i <= p; i++) {
			if (vector[i] == valor) {
				return true;
			}
		}
		return false;
	}

	static void tiempoTranscurrido(String mensaje, long t) {
		long m = t / 6000000000L;
		t = t % 6000000000L;
		long s = t / 1000000000;
		t = t % 1000000000;
		System.out.print(mensaje);
		System.out.println(m + "m " + s + "s " + t + "ns");
		;
	}
}