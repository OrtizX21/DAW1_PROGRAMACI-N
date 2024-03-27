package Maquinaria;
import Personal.*;
import Maquinaria.Locomotoras;
import Maquinaria.Vagones;

@SuppressWarnings("unused")

public class Trenes {
	
	Maquinistas Operario;
	
	Locomotoras Locomotora;
	
	Vagones Vagon[];
	
	private int NumVagones;

	public Trenes(Maquinistas operario, Locomotoras locomotora) {

		this.Operario = operario;
		this.Locomotora = locomotora;
		this.Vagon = new Vagones [5];
		NumVagones = 0;
	}
	
	public void AñadeVagon (String identificador, Integer CargaActual, Integer cargaMaxima, String tipoMercancia) {
		
		if (NumVagones >= 6) {
			
			System.out.println("El Tren No Admite Más Vagones.");
		}
		
		else {
			
			Vagones v1 = new Vagones (identificador, CargaActual, cargaMaxima, tipoMercancia);
			Vagon[NumVagones] = v1;
			NumVagones++;
		}
	}
}
