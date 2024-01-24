package Arrays;
import java.util.*;

public class Array_Bidemensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Crear una tabla bidimensional de longitud 5x6 y rellenarla de la siguiente
		 * forma: El elemento de la posición [n][m] debe contener el valor 10 x n + m.
		 * Después se debe mostrar su contenido
		 */		
		
		int [][] matriz = new int[5][6];

		
		for (int n = 0; n < matriz.length; n++) {
			
			System.out.println();
			
			for (int m = 0; m < matriz[0].length ; m++) {
				
				matriz [n][m] = (10 * n + m);
			}
		}
	
		System.out.print(Arrays.deepToString(matriz));
		
		
		for (int fila [] : matriz) {
			
			for (int columna : fila) {
				
				System.out.println(columna + " ");

			}
		}
		
	}

}
