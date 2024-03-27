package Maquinaria;

	class Vagones {
	
	String Identificador;
	Integer CargaActual;
	Integer CargaMaxima;
	String TipoMercancia;
	
	Vagones(String identificador, Integer CargaActual, Integer cargaMaxima, String tipoMercancia) {
		
		this.Identificador = identificador;
		this.CargaActual = CargaActual;
		this.CargaMaxima = cargaMaxima;
		this.TipoMercancia = tipoMercancia;
	}	
}