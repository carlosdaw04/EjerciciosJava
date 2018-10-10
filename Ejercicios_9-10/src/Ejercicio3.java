import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		float parcial1;
		float parcial2;
		float parcial3;
		float parcial_total;
		float examen;
		float examen_final;
		float trabajo;
		float trabajo_final;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Parcial 1: ");
		parcial1 = teclado.nextFloat();
		
		System.out.println("Parcial 2: ");
		parcial2 = teclado.nextFloat();
		
		System.out.println("Parcial 3: ");
		parcial3 = teclado.nextFloat();
		
		System.out.println("Nota examen final: ");
		examen = teclado.nextFloat();
		
		System.out.println("Nota trabajo final: ");
		trabajo = teclado.nextFloat();
		
		parcial_total = (parcial1 + parcial2 + parcial3) / 3 * 0.55f;

		examen_final = examen * 0.30f;
		
		trabajo_final = trabajo * 0.15f;
		
		System.out.println("Calificacion total: " + (parcial_total + examen_final + trabajo_final));
		
		teclado.close();
	}
}
