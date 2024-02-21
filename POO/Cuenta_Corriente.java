package POO;

	public class Cuenta_Corriente {

	String Dni; // DNI TITULAR.

	public String Nombre; // NOMBRE TITULAR.

	private double Saldo_Inicial;

	Cuenta_Corriente(String Dni, String Nombre) { // CONSTRUCTOR PADRE.

		this.Dni = Dni;

		this.Nombre = Nombre;

		Saldo_Inicial = 0;

	}

	// CON EL PUBLIC SE PUEDEN VER ATRIBUTOS Y METODOS DESDE CUALQUIER CLASE
	// (CARPETA O PAQUETE).
	
	// CON EL PRIVATE SOLO SE PUEDEN VER METODOS Y ATRIBUTOS DENTRO DESDE ESE MISMA
	// RUTA O CARPETA.
	
	// Y SIN NINGUNO DE ELLOS SE VEN SOLO DENTRO DE ESE MISMO PAQUETE.

	public Cuenta_Corriente() { // ASIGNACION VALORES CONSTRUCTOR.

		Dni = "";
		Nombre = "";
		Saldo_Inicial = 0;

	}

	Cuenta_Corriente(String Dni, String Nombre, double Saldo_Inicial) { // SOBRECARGA CONSTRUCTOR.

		this.Dni = Dni;
		this.Nombre = Nombre;
		this.Saldo_Inicial = Saldo_Inicial;
	}

	public double getSaldo(double Saldo_Inicial) {

		System.out.println("El Saldo De Tu Cuenta Es: " + Saldo_Inicial);

		return Saldo_Inicial;

	}

	void Datos() {// FUNCION PARA VER LOS VALORES ASIGNADOS EN LA OTRA CLASE (CONSTRUCTOR PADRE).

		System.out.println("Nombre: " + Nombre);

		System.out.println("Dni: " + Dni);

	}

	void Datos1() {//  FUNCION PARA VER LOS VALORES ASIGNADOS EN LA OTRA CLASE (CONSTRUCTOR SOBRECARGADO).

		System.out.println("Nombre: " + Nombre);

		System.out.println("Dni: " + Dni);

		System.out.println("Saldo Disponible De La Cuenta: " + Saldo_Inicial);

	}
}