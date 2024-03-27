package Personal;

public class Mecanicos {
	
	String Nombre;
	String Telefono;

	enum Especialidad {FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR}	
	
	Especialidad especialidad;

	public Mecanicos(String nombre, String telefono, String Especial) {

		this.Nombre = nombre;
		this.Telefono = telefono;
		this.especialidad = Especialidad.valueOf(Especial);
	}	
}