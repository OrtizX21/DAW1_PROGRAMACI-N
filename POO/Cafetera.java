package POO;

public class Cafetera {

	private int CapacidadMaxima;
	private int CantidadActual;
	
	Cafetera () {
		
		this.CapacidadMaxima = 1000;
		this.CantidadActual = 0;
	}
	
	Cafetera (int CapacidadMax) {
		
		this.CapacidadMaxima = CapacidadMax;
		this.CantidadActual = CapacidadMax;
	}
	
	Cafetera (int CapacidadMax, int CantActual) {
		
		this.CapacidadMaxima = CapacidadMax;
		this.CantidadActual = CantActual;
		
		if (CantidadActual > CapacidadMaxima) {
			
			this.CantidadActual = CapacidadMaxima;
		}
		
		else {
			
			this.CantidadActual = CantActual;
		}
	}
	
	void llenarCafetera () {
		
		this.CantidadActual = CapacidadMaxima;
	}
	
	void vaciarCafetera () {
		
		this.CantidadActual = 0;
	}
	
	int servirTaza (int Taza) {
				
		if (CantidadActual <= CapacidadMaxima) {
			
			CantidadActual = CantidadActual - Taza;
			System.out.println("Se Disminuyo El Café De La Taza: " + CantidadActual);
			System.out.println("Capacidad Actual De La Cafetera: " + CapacidadMaxima);
		}
		
		else {
			
			this.CantidadActual = 0;
			System.out.println("Ya Esta Llena La Taza De Café");
		}
		
		return this.CantidadActual;
	}
	
	int agregarCafe (int Cafes) {
		
		if (CantidadActual + Cafes < CapacidadMaxima) {
			
			this.CantidadActual += Cafes;
			System.out.println("Se Han Agregado Esta Cantidad De Cafés: " + CapacidadMaxima);
		}
		
		else {
			
			CantidadActual = CapacidadMaxima;
		}
		
		return CantidadActual;
	}

	@Override
	public String toString() {
		return "Cafetera La Capacidad Máxima De Esta Es: " + CapacidadMaxima + " C.C: , Cantidad Actual De La Cafetera: " + CantidadActual + " C.C" + "\n";
	}
	
	void Informacion () {
		
		System.out.println("Cantidad Actual De Cafes En La Cafetera: " + CantidadActual);
		System.out.println("Capacidad Maxima De La Cafetera: " + CapacidadMaxima);
	}
	
}
