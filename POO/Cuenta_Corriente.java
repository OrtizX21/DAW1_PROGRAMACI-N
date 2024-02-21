package POO;

	class CuentaCorriente {

	String Dni; // del titular

	public String Nombre; // del titular

	private double Saldo_Inicial;

	CuentaCorriente(String Dni, String Nombre) { // constructor)

		this.Dni = Dni;

		this.Nombre = Nombre;

		Saldo_Inicial = 0;

	}

	// CON EL PUBLIC SE PUEDEN VER ATRIBUTOS Y METODOS DESDE CUALQUIER CLASE
	// (CARPETA O PAQUETE).
	// CON EL PRIVATE SOLO SE PUEDEN VER METODOS Y ATRIBUTOS DENTRO DESDE ESE MISMA
	// RUTA O CARPETA.
	// Y SIN NINGUNO DE ELLOS SE VEN SOLO DENTRO DE ESE MISMO PAQUETE.

	public CuentaCorriente() {

		Dni = "";
		Nombre = "";
		Saldo_Inicial = 0;

	}

	CuentaCorriente(String Dni, String Nombre, double Saldo_Inicial) {

		this.Dni = Dni;
		this.Nombre = Nombre;
		this.Saldo_Inicial = Saldo_Inicial;
	}

	public double getSaldo(double Saldo_Inicial) {

		System.out.println("El Saldo De Tu Cuenta Es: " + Saldo_Inicial);

		return Saldo_Inicial;

	}

	void Datos() {// muetra el estado de la cuenta corriente

		System.out.println("Nombre: " + Nombre);

		System.out.println("Dni: " + Dni);

	}

	void Datos1() {// muetra el estado de la cuenta corriente

		System.out.println("Nombre: " + Nombre);

		System.out.println("Dni: " + Dni);

		System.out.println("Saldo Disponible De La Cuenta: " + Saldo_Inicial);

	}
}