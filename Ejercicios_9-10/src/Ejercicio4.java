import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
		float presupuesto;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Presupuesto total del hospital: ");
		presupuesto = teclado.nextFloat();
		
		System.out.println("Presupuesto para ginecología: " + presupuesto * 0.4);
		System.out.println("Presupuesto para traumatologia: " + presupuesto * 0.3);
		System.out.println("Presupuesto para pediatria: " + presupuesto * 0.3);
		
		teclado.close();
	}
}
