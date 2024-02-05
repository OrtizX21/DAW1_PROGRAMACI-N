package Mercadillo_Arrays;
import java.util.*;

public class Mercadillo1 {

	static int[] buscarTodos(int t[], int clave) {

		for (int i = 0; i < t.length; i++) {

			int [] tNueva = new int [0];
			
			if (t[i] == clave) {

				System.out.println("El Número " + clave + " Está En La Posición " + i + " De La Tabla");
				
				tNueva = Arrays.copyOf(t, t.length + 1);
			}

			else {
				
				int[] t1 = new int[0];

				System.out.println("Valor No Encontrado Devolvemos Tabla Vacia: " + t1);

			}
			
			System.out.print(Arrays.toString(tNueva));


		}

		
		
		return t;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Realiza la función: int[] buscarTodos (int t[], int clave), que crea y
		 * devuelve una tabla con todos los índices de los elementos donde se encuentra
		 * la clave de búsqueda. En el caso de que clave no se encuentre en la tabla t,
		 * la función devolverá una tabla vacía.
		 */

		int[] Tabla1 = { 11, 12, 13, 14, 11, 11 };

		int Key = 11;

		buscarTodos(Tabla1, Key);
	}

}
