package POO;

public class Punto {

	private double x;
	private double y;
	
	public Punto (double puntox, double puntoy) {
		
		this.x = puntox;
		this.y = puntoy;
	}
	
	
	
	void MostrarPuntos () {
		
		System.out.println("Eje X: " + x);
		System.out.println("Eje Y: " + y);
	}
}
