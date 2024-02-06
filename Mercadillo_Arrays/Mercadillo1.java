package Mercadillo_Arrays;

import java.util.*;

public class Mercadillo1 {

	static int[] buscarTodos(int t[], int clave) {

		int tab1 [] = new int[0];

		for (int i = 0; i < t.length; i++) {

			if (t[i] == clave) {
				
				tab1 = Arrays.copyOf(tab1, tab1.length + 1);

				tab1[tab1.length - 1] = i;

			}

		}

		System.out.println(Arrays.toString(tab1));

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

		int[] Tabla1 = { 11, 12, 13, 14, 15, 11, 12};

		int Clave = 12;

		buscarTodos(Tabla1, Clave);
	}

}
