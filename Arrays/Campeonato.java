package Arrays;
import java.util.*;

public class Campeonato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Puntuaciones = new Scanner (System.in);
		
		System.out.println("Introduce La Puntuación De Los Programadores:");
		
		int valores = 0;
		
		int Programadores[] = new int [5];
		
		
		for (int i = 0; i < Programadores.length; i++) {
			
			Programadores[i] = valores = Puntuaciones.nextInt();
						
			System.out.println(Arrays.toString(Programadores));
			
		}
		
		Arrays.sort(Programadores);
		
		System.out.println(Arrays.toString(Programadores));
				
		System.out.println(valores);
		
		while (valores != -1) {
			
			
		}
		



	}

}
