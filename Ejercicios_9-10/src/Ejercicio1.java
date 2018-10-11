import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		float capital;
		float remuneracion;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("El capital del cliente es: ");
		
		capital = teclado.nextFloat();
		
		remuneracion = capital * 0.02f;
		
		System.out.println("Remuneracion: " + remuneracion);
		teclado.close();
	}

}
