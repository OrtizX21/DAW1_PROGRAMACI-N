package Arrays_1;
import java.util.*;

public class Eliminar_Valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int t [] = {11, 22, 55, 15, 25};

		
		int Valor = 55;
		
		int indiceBorrado = Arrays.binarySearch(t, Valor) ;
		
		for (int i = 0; i < t.length; i++) {
			
			if (t[i] > Valor) {
				
				if (indiceBorrado < 0) {
					
					indiceBorrado =- indiceBorrado - 1 ;
					 t [indiceBorrado] = t [t.length -1]; //copia el último en indiceBorrado
				     t = Arrays.copyOf ( t, t.length - 1) ;  //disminuimos la longitud de t
				}
				
			}
			
			
			
		     System.out.println(Arrays.toString(t));  //mostramos

				System.out.println(indiceBorrado);
		}
		

	}
	
}
