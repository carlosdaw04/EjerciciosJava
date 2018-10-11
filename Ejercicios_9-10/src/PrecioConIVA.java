import java.util.Scanner;

public class PrecioConIVA {
	
	public static void main(String[] args) {
		float precio_sin_iva;
		int tipo_iva;
		float pvp;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Precio: ");
		precio_sin_iva = teclado.nextFloat();
		
		if (precio_sin_iva > 0) {
			System.out.println("Tipo de IVA: (0) 7% - (1) 10% - (2) 21% ");
			tipo_iva = teclado.nextInt();
			
			if(tipo_iva == 0) {
				pvp = precio_sin_iva + (precio_sin_iva * 0.07f);
				System.out.printf("El precio de venta final es: " + "%.2f", pvp + ":");
				
			}else if(tipo_iva == 1) {
				pvp = precio_sin_iva + (precio_sin_iva * 0.1f);
				System.out.printf("El precio de venta final es: " + "%.2f", pvp + ":");
								
			}else if(tipo_iva == 2) {
				pvp = precio_sin_iva + (precio_sin_iva * 0.21f);
				System.out.printf("El precio de venta final es: " + "%.2f", pvp + ":");
			}else {
				System.out.println("Tipo de IVA incorrecto.");
			}
		}else {
			System.out.println("Precio incorrecto.");
		}
		teclado.close();
	}
}
