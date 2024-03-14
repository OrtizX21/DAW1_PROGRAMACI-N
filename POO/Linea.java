package POO;

public class Linea {

	private Punto PuntoA;
	private Punto PuntoB;
	
	public Linea (Punto Punto1, Punto Punto2) {
		
		this.PuntoA = Punto1;
		this.PuntoB = Punto2;	
	}
	
	@Override
	public String toString() {
		return "Linea [PuntoA = " + PuntoA + ", PuntoB = " + PuntoB + "]";
	}
	
	double mueveDerecha (double xPositivo) {
		
		this.PuntoA.x += xPositivo;
		this.PuntoB.x += xPositivo;
		return xPositivo;
	}
	
	double mueveIzquierda (double xNegativo) {
		
		this.PuntoA.x -= xNegativo;
		this.PuntoB.x -= xNegativo;
		return xNegativo;
	}
	
	double mueveArriba (double yPositivo) {
		
		this.PuntoA.y += yPositivo;
		this.PuntoB.y += yPositivo;
		return yPositivo;
	}
	
	double mueveAbajo (double yNegativo) {
		
		this.PuntoA.y -= yNegativo;
		this.PuntoB.y -= yNegativo;
		return yNegativo;
	}	
	
	boolean lineasParalelas (Linea uno, Linea dos) {
		
		boolean Paralela = false;
		
		double forma1 = (uno.PuntoA.y - uno.PuntoB.y);
		double forma2 = (dos.PuntoA.y - dos.PuntoB.y);
		
		if (forma1 == forma2) {
			
			Paralela = true;
			System.out.println("Las Lineas Son Paralelas: " + Paralela);
		}
		
		return Paralela;
	}
}
