package Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Campeonato_Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * Diseñar una aplicación para gestionar un campeonato de programación, donde se
		 * introduce la puntuación (enteros) obtenidos por 5 programadores, conforme van
		 * terminando su prueba. La aplicación debe mostrar las puntuaciones ordenadas
		 * de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes
		 * anteriores, se suman al campeonato programadores de exhibición, cuyos puntos
		 * se incluyen con el resto. La forma de especificar que no intervienen más
		 * programadores de exhibición es introducir como puntuación un -1. La
		 * aplicación debe mostrar, finalmente, los puntos ordenados de todos los
		 * participantes
		 */
		Scanner Puntuaciones = new Scanner (System.in);
		
		System.out.println("Introduce La Puntuación De Los Programadores:");
		
		int valores = 0;
		
		int valoresExhibicion = 0;
		
		int Programadores[] = new int [5];
		
		
		for (int i = 0; i < Programadores.length; i++) {
			
			Programadores[i] = valores = Puntuaciones.nextInt();
						
			System.out.println(Arrays.toString(Programadores));
			
			
			
		}
		
		Arrays.sort(Programadores);
		
		System.out.println(Arrays.toString(Programadores));
				
		System.out.println("Estos son los valores: " + valores);
		
		
		
		  while (valores != -1) {
			  
			  if (valores == -1) { 
				  
				  System.out.println("Fin Del Programa");
				  System.exit(0);
			  }
			 
			  
			Puntuaciones.nextInt();

			
			int ProgramadoresExhibicion [] = new int [Programadores.length];

			System.arraycopy(Programadores, valores, ProgramadoresExhibicion, 0, Programadores.length);
			
		  
		 }
	}

}
