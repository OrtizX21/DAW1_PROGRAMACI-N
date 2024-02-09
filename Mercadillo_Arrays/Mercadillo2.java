package Mercadillo_Arrays;

import java.util.Arrays;

public class Mercadillo2 {

	static int[] Desordenar(int tabla[]) {

		for (int i = 0; i < tabla.length; i++) {

			// GENERA NUMERO ALE.
			int NumeroRandom = (int) (Math.random() * tabla.length);

			// GUARDA EN LA VARIABLE POS LOS VALORES DE LA TABLA.
			int Pos = tabla[i];

			// DESPUES EN LOS VALORES DE LA TABLA GUARDAMOS LOS VALORES ALEATORIOS
			// GENERADOS.
			tabla[i] = tabla[NumeroRandom];

			// POR ULTIMO LA VARIABLE RANDOM SE GUARDAN LOS VALORES EN LAS POSICIONES.
			tabla[NumeroRandom] = Pos;
		}

		System.out.println(Arrays.toString(tabla));

		return tabla;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2 -Escribe la función void desordenar (int t[]), que cambia de forma
		 * aleatoria los elementos contenidos en la tabla t, si la tabla estuviera
		 * ordenada dejaría de estarlo.
		 */

		int Tabla1[] = { 11, 12, 13, 14, 15, 16 };

		Desordenar(Tabla1);

	}

}
