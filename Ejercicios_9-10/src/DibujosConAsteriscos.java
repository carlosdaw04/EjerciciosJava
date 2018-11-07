
public class DibujosConAsteriscos {

	static void volcan(int h) {
		int asteriscos = 2;
		int espacios;
		int t = (int) (Math.pow(2, h) / 2);

		for (int i = 1; i <= h; i++) {
			espacios = t - (asteriscos / 2);

			for (int j = 1; j <= espacios; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= asteriscos; j++) {
				System.out.print("*");
			}

			System.out.println();
			asteriscos += asteriscos;
		}
	}

	static void mosaico(int f, int c) {
		for (int i = 1; i <= f; i++) {
			if (i % 2 == 0) {
				for (int j = 1; j <= c; j++) {
					if (j % 2 != 0) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}
			} else {
				for (int j = 1; j <= c; j++) {
					if (j % 2 == 0) {
						System.out.print('*');
					} else {
						System.out.print(' ');
					}
				}
			}
			System.out.println();
		}
	}

	static void mosaico2(int f, int c) {
		for (int i = 1; i <= f; i++) {
			for (int j = 1; j <= c; j++) {
				if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {

					System.out.print('*');
				} else {
					System.out.print(' ');
				}
			}
		}
		System.out.println();
	}

	static void mosaico3(int f, int c) {
		for (int i = 1; i <= f; i++) {
			for (int j = 1; j <= c; j++) {
				System.out.print((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0) ? '*' : ' '); // Para quitar
																										// el if
			}
			System.out.println();
		}
	}

	static void tablero(int f, int c, int l) {
		for (int i = 0; i < f; i++) {
			for (int j = 0; j < l; j++) {
				for (int z = 0; z < c; z++) {
					for (int r = 0; r < l; r++)
						if ((i % 2 == 0 && z % 2 != 0) || (i % 2 != 0 && z % 2 == 0)) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
				}
				System.out.println();
			}
		}

	}

	static void tablero2(int f, int c, int l) {
		int ctxt = c*l;
		int ftxt = f*l;
		for (int i = 0; i < ftxt; i++) {
			for (int j = 0; j < ctxt; j++) {
				int ctab = j / l;
				int ftab = i / l;
				
				if ((ftab % 2 == 0 && ctab % 2 != 0) || (ftab % 2 != 0 && ctab % 2 == 0)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
