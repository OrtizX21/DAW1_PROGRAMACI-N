package Arrays;
import java.util.*;

public class Cámara_Secreta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Desarrollar el juego "la cámara secreta" que consiste en abrir una cámara
		 * mediante su combinación secreta, que está formada por una combinación de
		 * dígitos de uno al cinco. El jugador especificará cuál es la longitud de la
		 * combinación, a mayor longitud, mayor será la dificultad del juego. La
		 * aplicación genera de forma aleatoria una combinación secreta que el usuario
		 * tendrá que acertar. En cada intento se muestra como pista, para cada dígito
		 * de la combinación introducido si es mayor, menor o igual que el
		 * correspondiente en la combinación secreta
		 */
		
		System.out.println("!INICIAMOS EL JUEGO DE CÁMARA SECRETA¡");
		
		Scanner Clave = new Scanner (System.in);
		
		System.out.println("!Empezamos El Juego¡");
		
		int Apuesta;
		Apuesta = Clave.nextInt();

		System.out.println("Introduce La Combinación:");

	
		int CombinacionSecreta [] = new int [5];	
		int Combinacion[] = new int [5];
		
		
		for (int k = 0; k < Apuesta; k++) {
			
			Combinacion[k] = Clave.nextInt();
			
			System.out.println(Combinacion[k]);
		}
		
		System.out.println(Arrays.toString(Combinacion));
		
		
		for (int j = 0; j < CombinacionSecreta.length; j++) {
			
			CombinacionSecreta[j] = (int) (Math.random() * 5) + 1;
			
			System.out.print(CombinacionSecreta[j]);	
		}
		
		
		Clave.close();
	}

}