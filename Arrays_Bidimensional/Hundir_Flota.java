package Arrays_Bidimensional;

import java.util.*;

public class Hundir_Flota {

	static void TableroAgua(char[][] Jugador) {

		for (int i = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.print("~ ");
			}

			System.out.println();
		}
	}

	static int Columnas() {

		Scanner Dato = new Scanner(System.in);

		System.out.println("Introduce Una Letra De La Columna Entre ( A - J ): ");

		String Colum = Dato.next();

		char Letra = Colum.charAt(0);

		int Pos = Letra - 64;

		System.out.println(Pos);

		Dato.close();
		return Letra;
	}
	
	static int Filas () {
		
		Scanner Dato = new Scanner(System.in);

		System.out.println("Introduce Una Numero Para La Fila Entre ( 1 - 10 ): ");

		int Fila = Dato.nextInt();

		System.out.println(Fila);

		Dato.close();
		
		return Fila;
		
	}

	static void PonerBarcos(char[][] Barco, int Longitud) {

		char [][] PortaAviones = new char [5][5];
		
		char [][] Acorazado = new char [4][4];
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TABLEROS DE LOS JUGADORES (PANTALLA PARA LOS DISPAROS).
		char[][] TJugador1 = new char[12][12];
		TableroAgua(TJugador1);

		// char[][] TJugador2 = new char[12][12];
		// TableroAgua(TJugador2);

		////////////////////////////////////////////////////////////////////////

		// TABLEROS DE LOS BARCOS DE LOS JUGADORES (PANTALLA PARA LOS BARCOS)
		char[][] BarcosJ1 = new char[12][12];
		TableroAgua(BarcosJ1);

		// char [][] BarcosJ2 = new char [12][12];
		// TableroAgua(BarcosJ2);

	}
}