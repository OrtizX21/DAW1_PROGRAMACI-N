package Control_De_Flujo;
import java.util.*;

public class Recuento {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	/*
	 * Escribe un programa que lea una lista de diez números y haga un recuento de
	 * cuántos son positivos, y cuántos son negativos. Mostrará por consola el
	 * resultado.
	 */
	
	// DEFINIMOS EL CONTADOR HASTA 10, INTRODUCIMOS LOS NUMEROS Y DESPUES CON LOS CONDICIONALES AJUSTAMOS EL RECUENTO DE POSITIVO Y NEGATIVO.
	Scanner Numero = new Scanner(System.in);

		int Positivo = 0;
		int Negativo = 0;
		System.out.print("Ingrese Un Numero: ");

		for (int Lista = 0; Lista < 10; Lista++) {
			
			
			int Num = Numero.nextInt();
	        	
			if (Num > 0) {Positivo++;}	
			if (Num < 0) {Negativo++;}
			
			}
 
		System.out.println("Numeros Positivos Totales: "+ Positivo);
		System.out.println("Numeros Negativos Totales: "+ Negativo);

		Numero.close();

     }

}