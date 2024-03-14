
package POO;

public class Linea {

	Punto puntoA; 
	Punto PuntoB;
	
	// CONSTRUCTOR LINEA QUE RECIBE DOS OBJETOS DE TIPO PUNTO.
	
	public Linea (Punto Punto1 ,Punto Punto2) {
  
	this.puntoA = Punto1; 
	this.PuntoB = Punto2;
	
	}
	
	double mueveDerecha (double x) {
		
		return x;
	}
}
