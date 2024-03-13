package POO;

public class Cafetera {

	private int CapacidadMaxima;
	private int CantidadActual;

	Cafetera() {

		this.CantidadActual = 0;
		this.CapacidadMaxima = 1000;

	}

	Cafetera(int actual) {

		this.CapacidadMaxima = actual;

	}

	Cafetera(int actual, int maximo) {

		this.CantidadActual = actual;
		this.CapacidadMaxima = maximo;

		if (CantidadActual > CapacidadMaxima) {

			System.out.println("Esta La Cafetera LLena");
		}

		else {

			System.out.println("Se Esta Preparando El Café");
		}

	}

	void llenarCafetera() {

		CapacidadMaxima = CantidadActual;
	}

	int servirTaza(int taza) {

		if (taza < CapacidadMaxima) {

			this.CantidadActual += taza;

			System.out.println("No Alcanza Para LLenarse La Taza Agregando Café: " + CantidadActual + " C.C.");
		}

		else {

			System.out.println("Sirviendo Cafecito");
		}

		return taza;
	}

	void vaciarCafetera() {

		this.CantidadActual = 0;
	}

	int agregarCafe(int Volumen) {

		Volumen = CantidadActual;
		return Volumen;
	}

	@Override
	public String toString() {
		return "Cafetera La Capacidad Máxima De Esta Es: " + CapacidadMaxima
				+ " C.C: , Cantidad Actual De La Cafetera: " + CantidadActual + " C.C" + "\n";
	}

	void info() {

		System.out.println("Cantidad Actual De La Cafetera: " + CantidadActual + " C.C.");
		System.out.println("Cantidad Máxima De La Cafetera: " + CapacidadMaxima + " C.C.");
	}
}