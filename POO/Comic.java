package POO;

public class Comic {

	private String Titulo; // TITULO DEL COMIC.
	private int NumComic; // NUMERO DEL COMIC.
	private int EDisponibles; // EJEMPLARES DISPONIBLES.
	private int EPrestados; // EJEMPLARES PRESTADOS.
	//int Unidades; // UNIDADES QUE SE PRESTAN DE LOS METODOS SET Y GET
	//int Devueltos; // UNIDADES QUE SE REGRESAN DESDE LOS METODOS SET Y GET

	Comic(String Titulo, int NumComic, int Edisponibles, int EPrestados) {

		this.Titulo = Titulo;
		this.NumComic = NumComic;
		this.EDisponibles = Edisponibles;
		this.EPrestados = EPrestados;
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

		Disponible = EDisponibles;
	}

	int getEdisponibles() {

		System.out.println("Cantidades Disponibles Del Cómic Es: " + EDisponibles);
		return EDisponibles;
	}

	void setEPrestados(int Prestados) {

		Prestados = EPrestados;
	}

	int getEPrestados() {

		System.out.println("Cantidades Prestadas Del Cómic Es: " + EPrestados);
		return EPrestados;
	}
	
	int Prestamo (int Eprestados) {
		
		EDisponibles --;
		EDisponibles -= EPrestados;
		
		return EDisponibles;
	}
	
	int Devolucion (int EDisponibles) {
		
		EPrestados += EDisponibles;
		
		return EPrestados;
		
	}
	/*
	 * void getPrestamo () {
	 * 
	 * boolean Operacion = false;
	 * 
	 * 
	 * if (Operacion == true) {
	 * 
	 * while (EDisponibles != 0) {
	 * 
	 * Unidades -= EDisponibles;
	 * 
	 * System.out.println("Puedes Realizar El Prestamo Del Cómic."); } }
	 * 
	 * else if (EDisponibles == 0) {
	 * 
	 * Operacion = false;
	 * 
	 * System.out.println("No Hay Unidades Disponibles Del Cómic Para Prestamo."); }
	 * 
	 * System.out.println("Se Han Prestado Esta Cantidad De Cómics: " +
	 * EDisponibles);
	 * 
	 * }
	 * 
	 * int setDevolucion (int Devuelto) {
	 * 
	 * EPrestados += Devuelto;
	 * 
	 * return EPrestados; }
	 * 
	 * void getDevolucion () {
	 * 
	 * boolean Regresado = false;
	 * 
	 * if (Regresado == true) {
	 * 
	 * while (EPrestados != 0) {
	 * 
	 * Devueltos += EPrestados;
	 * 
	 * } } else if (EPrestados == 0) {
	 * 
	 * Regresado = false;
	 * 
	 * System.out.println("No Se Han Regresado Unidades Del Cómic"); }
	 * 
	 * System.out.println("Se Han Devuelto Esta Cantidad De Cómics: " +
	 * EDisponibles);
	 * 
	 * 
	 * 
	 * }
	 */
	
	void Info () {
		
		System.out.println("El Nombre Del Cómic Es: " + Titulo);
		System.out.println("El Número Del Cómic Es: " + NumComic);
		System.out.println("Cantidades Disponibles Del Cómic Es: " + EDisponibles);
		System.out.println("Cantidades Prestadas Del Cómic Es: " + EPrestados);
	}
	}