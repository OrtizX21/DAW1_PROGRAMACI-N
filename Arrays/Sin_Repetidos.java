package Arrays;
import java.util.*;

public class Sin_Repetidos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int t [] = {1, 2, 20, 3, 24, 1, 2, 20, 3, 24
				};
		
		t = SinRepetidos (t);
		
		System.out.println(Arrays.toString(t));

	}

	
	static int [] SinRepetidos (int Tabla[]) {
		
		int temporal [] = new int [0];
		
		for (int elemento : Tabla) {
			
			if (Arrays.binarySearch(temporal, elemento) <0) {
				
				temporal = Arrays.copyOf(temporal, temporal.length + 1);
				
				temporal [temporal.length-1]= elemento;
			}
		}
		
		return temporal;
		
	}
	
}