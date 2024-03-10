package POO;

public class Alumno {

	private String Dni;
	private String Nombre;
	private double[] NotasFinales = new double [3];

	
	Alumno(String dni, String nombre) {
		
		this.Dni = dni;
		this.Nombre = nombre;
	}
	
	Alumno(String dni){
		
		this.Dni = dni;
		this.Nombre = "";
	}
	
	Alumno(String dni, String nombre, double [] notas){
		
		this.Dni = dni;
		this.Nombre = nombre;
		this.NotasFinales = notas;
	}

	void setNombre(String Name) {

		Nombre = Name;
	}
	
	String getDni() {

		System.out.println("El Dni Del Alumno Es: " + Dni);
		return Dni;
	}

	

	String getNombre() {

		System.out.println("El Nombre Del Alumno Es: " + Nombre);
		return Nombre;
	}

	public void SetNota1(double Nota1) {

		NotasFinales[0] = Nota1;
	}

	double[] GetNota1() {

		return NotasFinales;
	}

	void SetNota2(double Nota2) {

		NotasFinales[1] = Nota2;
	}

	double[] GetNota2() {
		
		return NotasFinales;
	}

	void SetNota3(double Nota3) {

		NotasFinales[2] = Nota3;
	}

	double[] GetNota3() {

		return NotasFinales;
	}
	
	void Informacion () {
		
		System.out.println("Dni Del Alumno Ea: " + Dni);
		System.out.println("Nombre Del Alumno Ea: " + Nombre);
		System.out.println("Notas Del Alumno Son: " + "PT: " + NotasFinales[0] + " " + "ST: " + NotasFinales[1] + " " + "TT: " + NotasFinales[2]);		
	}
}
