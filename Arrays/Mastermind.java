package Arrays;
import java.util.*;

public class Mastermind {
	
	static int [] Jugador1 (int [] numeros) {
		
		Scanner Digitos = new Scanner (System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i] = Digitos.nextInt();
		}
		
		return numeros;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Numeros = new Scanner (System.in);	
		System.out.println("Introduce La Cantidad De Digitos De Los Jugadores:");

		int Longitud = Numeros.nextInt();	
		
		int Jugador1 [] = new int [Longitud];
		int Jugador2 [] = new int [Longitud];
		
		Jugador1(Jugador1);
		

		Scanner Rounds = new Scanner (System.in);
		System.out.println("Introduce La Cantidad De Los Rounds:");
		
		int Rondas = Rounds.nextInt();
		
		Jugador1 = new int [Rondas];
		Jugador2 = new int [Rondas];
		
		
		Numeros.close();
		Rounds.close();
		
	}

}