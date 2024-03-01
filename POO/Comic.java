package POO;

public class Comic {

	private String Titulo; // TITULO DEL COMIC.
	private int NumComic; // NUMERO DEL COMIC.
	private int Disponibles; // EJEMPLARES DISPONIBLES.
	private int Prestados; // EJEMPLARES PRESTADOS.
	

	Comic(String Titulo, int NumComic, int Edisponibles, int EPrestados) {

		this.Titulo = Titulo;
		this.NumComic = NumComic;
		this.Disponibles = Edisponibles;
		this.Prestados = EPrestados;
	}

	void setTitulo(String nomt) {

		nomt = Titulo;
	}

	String getTitulo() {

		System.out.println("El Nombre Del Cómic Es: " + Titulo);
		return Titulo;
	}

	void setNumComic(int num) {

		num = NumComic;
	}

	int getNumComic() {

		System.out.println("El Número Del Cómic Es: " + NumComic);
		return NumComic;
	}

	void setEDisponibles(int Disponible) {

		Disponible = Disponibles;
	}

	int getEdisponibles() {

		System.out.println("Cantidades Disponibles Del Cómic Es: " + Disponibles);
		return Disponibles;
	}

	void setEPrestados(int EPrestados) {

		EPrestados = Prestados;
	}

	int getEPrestados() {

		System.out.println("Cantidades Prestadas Del Cómic Es: " + Prestados);
		return Prestados;
	}

	boolean Prestamo() {

		if (Disponibles == 0) {
			
			System.out.println("No Se Pueden Realizar Prestamos del Cómic No Hay Unidades Disponibles.");
		}
		
		if (Disponibles > 0) {

			this.Disponibles--;
			this.Prestados++;
			return true;

		}

		else {

			return false;
		}
	}

	boolean Devolucion() {

		if (Prestados == 0) {
			
			System.out.println("Todas Las Unidades Del Cómic Estan Disponibles.");
		}
		
		if (Prestados > 0) {

			this.Disponibles++;
			this.Prestados--;
			return true;
			
		}

		else {

			return false;
		}
	}

	void Info() {
		
		Devolucion();

		System.out.println("El Nombre Del Cómic Es: " + Titulo + ".");
		System.out.println("El Número Del Cómic Es: " + NumComic + ".");
		System.out.println("Cantidades Disponibles Del Cómic Es: " + Disponibles + ".");
		System.out.println("Cantidades Prestadas Del Cómic Es: " + Prestados + ".");

	}
}
