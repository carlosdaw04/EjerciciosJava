import java.util.Scanner;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		float venta1;
		float venta2;
		float venta3;
		float comision1;
		float comision2;
		float comision3;
		final float salario = 1200;
		final float porcentaje = 0.1f;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor de la venta 1: ");
		venta1 = teclado.nextFloat() * porcentaje;
		comision1 = venta1 * porcentaje;
		
		System.out.println("Valor de la venta 2: ");
		venta2 = teclado.nextFloat() * porcentaje;
		comision2 = venta2 * porcentaje;
		
		System.out.println("Valor de la venta 3: ");
		venta3 = teclado.nextFloat() * porcentaje;
		comision3 = venta3 * porcentaje;
		
		System.out.println("Valor comision 1: "+ comision1);
		
		System.out.println("Valor comision 2: "+ comision2);
		
		System.out.println("Valor comision 3: "+ comision3);
		
		System.out.printf("Sueldo final: " + "%.2f %n" , comision1  + comision2  + comision3 + salario);
		teclado.close();
	}
}