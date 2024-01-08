package Debugging;
import java.util.*;
public class resultadoTres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		//Desarrolla un programa que devuelva por consola si los números introducidos
		//por el usuario son mayores que 50.
		//El programa terminará cuando el usuario introduzca un "-1".
		
		int numero=-1;
		
		Scanner entrada=new Scanner(System.in);
		
		int numeroAComprobar=entrada.nextInt();
		
		while (numero!=-1) {
			
			System.out.println("Introduce un número");
			numero=entrada.nextInt();
			
			if (numero>50) {
				
				System.out.println("tu número es mayor que 50");

			}
			
			else if (numero <50) {
				
				System.out.println("tu número es menor que 50");
			}
			
			else if (numero ==50) {
				
				System.out.println("tu número es igual a 50");
			}
		}
		
		System.out.print("fin del programa");

	}

}
