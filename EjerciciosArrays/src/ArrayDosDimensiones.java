import java.util.Random;

public class ArrayDosDimensiones {
	public static void main(String[] args) {
		Random r = new Random();
		int[][] matriz;
		matriz = new int[7][5];		//[filas][columnas]
		
		for (int i=0; i<7; i++) {
			for(int j=0; j<5; j++) {
				matriz[i][j] = r.nextInt(20);
			}
		}
		
		for (int i=0; i<7; i++) {
			for(int j=0; j<5; j++) {
				//System.out.print(matriz[i][j] + " ");
				System.out.print(String.format("%-2d ", matriz[i][j]));		//"%-2d " alineados por la izquierda	
			}																//"%2d " alineado por la derecha
			System.out.println();
		}
	}
}
