public class EscribirTriangulos {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			int n = i % 10;
			int espacios = 10 - i;
			int digitos = i + i - 1;

			for (int j = 0; j < espacios; j++) {
				System.out.print(" ");
			}

			for (int h = 0; h < digitos; h++) {
				if (h >= digitos / 2) {
					System.out.print(n--%10);

				} else if (h <= digitos / 2) {
					System.out.print(n++%10);
				}
			}
			System.out.println();
		}
	}
}
