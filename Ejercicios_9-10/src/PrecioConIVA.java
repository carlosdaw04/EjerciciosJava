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
			System.out.println("Tipo de IVA: ");
			tipo_iva = teclado.nextInt();
			
			if(tipo_iva == 4) {
				pvp = precio_sin_iva + (precio_sin_iva * 0.04f);
				System.out.printf("El precio de venta final es: " + "%.2f", pvp);
				
			}else if(tipo_iva == 7) {
				pvp = precio_sin_iva + (precio_sin_iva * 0.07f);
				System.out.printf("El precio de venta final es: " + "%.2f", pvp);
								
			}else if(tipo_iva == 16) {
				pvp = precio_sin_iva + (precio_sin_iva * 0.16f);
				System.out.printf("El precio de venta final es: " + "%.2f", pvp );
			}else {
				System.out.println("Tipo de IVA incorrecto.");
			}
		}else {
			System.out.println("Precio incorrecto.");
		}
		teclado.close();
	}
}
