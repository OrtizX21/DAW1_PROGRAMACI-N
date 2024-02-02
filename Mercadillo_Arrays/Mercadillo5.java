package Mercadillo_Arrays;
import java.util.*;

public class Mercadillo5 {
	
	static int [] LeeNotas (int t[]) {
		
		Scanner Datos = new Scanner (System.in);
		
		for (int i = 1; i < t.length; i++) {
			
			System.out.println("Introduce Las Notas Del Alumno: " + i);
			
			t[i] = Datos.nextInt(); 
		}
		
		
		return t;
	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 5.- Debes crear una aplicación que ayude a gestionar las notas de un centro
		 * educativo. Los alumnos se organizan en grupos compuestos por 5 personas. leer
		 * las notas (números enteros) del primer, segundo y tercer trimestre de un
		 * grupo. Debes mostrar al final la nota media del grupo en cada trimestre y la
		 * media del alumno que se encuentra en una posición dad ( que el usuario
		 * introduce por teclado).
		 */
		

		final int RecogeNotas = 6;
		double Media = 0;
		
		
		int [] NotasPrimero = new int [RecogeNotas];	
		int [] NotasSegundo = new int [RecogeNotas];
		int [] NotasTercero = new int [RecogeNotas];
		
		
		System.out.println("Introduce Las Notas Del Primer Grupo: \n");
		
		LeeNotas(NotasPrimero);
		
		System.out.println();
		System.out.println("Introduce Las Notas Del Segundo Grupo: \n");
		LeeNotas(NotasSegundo);
		
		System.out.println();
		System.out.println("Introduce Las Notas Del Tercer Grupo:  \n");
		LeeNotas(NotasTercero);


		int MediaPrimero = 0;
		int MediaSegundo = 0;
		int MediaTercero = 0;

		for (int i = 0; i < RecogeNotas; i++) {
			
			MediaPrimero += NotasPrimero[i];
			MediaSegundo += NotasSegundo[i];
			MediaTercero += NotasTercero[i];
			
		}
		

		System.out.println("La Media Del Primer Grupo Es: " + (double) MediaPrimero / RecogeNotas);	
		System.out.println("La Media Del Segundo Grupo Es: " + (double) MediaSegundo / RecogeNotas);
		System.out.println("La Media Del Tercer Grupo Es: " + (double) MediaTercero / RecogeNotas);
		

		Scanner Ps = new Scanner (System.in);
		
		System.out.println("");
		System.out.println("Seleccione La Posicion A Elegir: ");
		
		int Posic = Ps.nextInt();
		
		Media = (double) (NotasPrimero[Posic] + NotasSegundo[Posic] + NotasTercero[Posic]);
		
		System.out.println("");
		System.out.println("La Media Del Alumno En La Posicion Introducida Es: " + Media);

		Ps.close();
		
	}

}
