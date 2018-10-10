import java.util.Scanner;

public class Ejercicio2_correccion {
	
	public static void main(String[] args) {
		float venta;
		float comision;
		float sueldo = 1200;
		final float porcentaje = 0.1f;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Valor de la venta 1: ");
		venta = teclado.nextFloat() ;
		comision = venta * porcentaje;
		sueldo += comision;
		System.out.println("Comision por la venta 1: "+comision);
		
		System.out.println("Valor de la venta 2: ");
		venta = teclado.nextFloat() ;
		comision = venta * porcentaje;
		sueldo += comision;
		System.out.println("Comision por la venta 2: "+comision);
		
		System.out.println("Valor de la venta 3: ");
		venta = teclado.nextFloat() ;
		comision = venta * porcentaje;
		sueldo += comision;
		System.out.println("Comision por la venta 3: "+comision);
		
		System.out.println("Sueldo final: " + sueldo);
		
		teclado.close();
	}
}