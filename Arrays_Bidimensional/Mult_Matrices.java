package Arrays_Bidimensional;
import java.util.*;

public class Mult_Matrices {
	
	static void ProductoMatrices (int t1[][], int t2[][]) {
		
		int[][] Multiplica = new int[t1.length][t2[0].length];


		// FILAS DE LA MATRIZ UNO
		for (int i = 0; i < t1.length; i++) {

			// COLUMNAS DE LA MATRIZ DOS
			for (int j = 0; j < t2[0].length; j++) {

				// COLUMNAS DE LA MATRIZ UNO
				for (int k = 0; k < t1[0].length; k++) {

					Multiplica[i][j] += t1[i][k] * t2[k][j];
				}
			}
			
		}
	

	System.out.println(Arrays.deepToString(Multiplica));

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implementa la función int [ ] [ ] productoMatrices ( int [ ] [ ] matrizUno,
		 * int [ ] [ ] matrizDos) la cual devuelve otra matriz resultado de la
		 * multiplicación de matrizUno x matrizDos.
		 */

	
		int[][] matrizUno = { { 1, 2, 3 }, 
				              { 4, 5, 6 }, 
				              { 7, 8, 9 } };

		int[][] matrizDos = { { 1, 4, 7, }, 
				              { 2, 5, 8, }, 
				              { 3, 6, 9 } };
		
		
		ProductoMatrices(matrizUno, matrizDos);
			
	}

}