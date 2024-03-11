package POO;
import java.util.*;

public class Examen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 CREAR TABLA DE 1000 ELEMENTOS.
		int t[] = new int[1000];

		// 2 INICIALIZAR LA TABLA CON VALORES MAYORES A -100.
		for (int i = 0; i < t.length; i++) {

			t[i] = (int) ((Math.random() * 200) -100);
		}

		// 3 MOSTRAR LA SUMA DE TODOS LOS VALORES DE LA TABLA.
		int Suma = 0;

		for (int i = 0; i < t.length; i++) {

			Suma = Suma + t[i];
		}

		System.out.println("La Suma De Los Elementos Es: " + Suma);
		
		
		//4 BORRAR LOS ELEMENTOS QUE SEAN 20 DE LA TABLA.
		
		int tcopia [] = Arrays.copyOf(t, t.length);
		int i =  0;
		
		while (i < tcopia.length) {
			
			if (tcopia[i] == 20) {
				tcopia[i] = tcopia [tcopia.length-1];
				tcopia = Arrays.copyOf(tcopia, tcopia.length-1);
			}
			
			else {
				
				i++;
			}
			
			t = tcopia;
			
			Arrays.sort(t);
			System.out.println(Arrays.toString(t));
		}
		
		//5 INSERTAR EL NUMERO 28 EN LA TABLA T.
		t = Arrays.copyOf(t, t.length +1);
		t[t.length -1]= 28;
		
		
		//6 MOSTRAR LA TABLA Y TRATARLA DE MANERA ORDENADA.
		Arrays.sort(t);
		
		//7 INSTERTAR EL NUMERO 35 EN LA TABLA.
		int [] copia= new int [t.length+1];
		int indice = Arrays.binarySearch(t, 35);
		
		if (indice>=0) { //Significa que el numero lo ha encontrado en la tabla
			System.arraycopy(t, 0, copia, 0, indice);
			System.arraycopy(t, indice, copia, indice+1, t.length-indice);
			copia[indice]=35;
			
		} else { // No se encuentra en la tabla
			indice=-indice-1;
			System.arraycopy(t, 0, copia, 0, indice);
			System.arraycopy(t, indice, copia, indice+1, t.length-indice);
			copia[indice]=35;
		}
		
		t=Arrays.copyOf(copia, copia.length);
		
		//8 MOSTRAR LA CANTIDAD DE REGISTROS QUE TIENE LA CUENTA. 
		int Registros = t.length;
		System.out.println("La Tabla T Contiene Este Numero De Registros: " + Registros);
		
		//9 CAMBIAR EL NOMBRE DE LA TABLA T A TABLAEXAMEN.
		int [] TablaExamen = t;
		System.out.println(Arrays.toString(TablaExamen));
	}

}
