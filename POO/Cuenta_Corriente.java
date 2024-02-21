package POO;


    /*En la clase CuentaCorriente sobrecargar los constructores para poder crear objetos
    - con el DNI del titular de la cuenta y un saldo inicial
    - con el DNI, nombre y el saldo inicial

    Escribir un programa que compruebe el funcionamiento de los métodos*/

	public class Cuenta_Corriente {

	String Dni; // DNI TITULAR.

	public String NombreD; // NOMBRE TITULAR.
	
	public String NombreP; // NOMBRE PERSONA.

	private double Saldo_Inicial;

	Cuenta_Corriente(String Dni, String Nombre) { // CONSTRUCTOR PADRE.

		this.Dni = Dni;

		this.NombreD = Nombre;

		Saldo_Inicial = 0;

	}

	// CON EL PUBLIC SE PUEDEN VER ATRIBUTOS Y METODOS DESDE CUALQUIER CLASE
	// (CARPETA O PAQUETE).
	
	// CON EL PRIVATE SOLO SE PUEDEN VER METODOS Y ATRIBUTOS DENTRO DESDE ESE MISMA
	// RUTA O CARPETA.
	
	// Y SIN NINGUNO DE ELLOS SE VEN SOLO DENTRO DE ESE MISMO PAQUETE.

	public Cuenta_Corriente() { // ASIGNACION VALORES CONSTRUCTOR.

		Dni = "";
		NombreD = "";
		Saldo_Inicial = 0;

	}

	Cuenta_Corriente(String Dni, String NombreP, double Saldo_Inicial) { // SOBRECARGA CONSTRUCTOR.

		this.Dni = Dni;
		this.NombreP = NombreP;
		this.Saldo_Inicial = Saldo_Inicial;
	}

	public double getSaldo(double Saldo_Inicial) {

		System.out.println("El Saldo De Tu Cuenta Es: " + Saldo_Inicial);

		return Saldo_Inicial;

	}

	void Datos() {// FUNCION PARA VER LOS VALORES ASIGNADOS EN LA OTRA CLASE (CONSTRUCTOR PADRE).

		System.out.println("Nombre: " + NombreD);

		System.out.println("Dni: " + Dni);

	}

	void Datos1() {//  FUNCION PARA VER LOS VALORES ASIGNADOS EN LA OTRA CLASE (CONSTRUCTOR SOBRECARGADO).

		System.out.println("Nombre: " + NombreP);

		System.out.println("Dni: " + Dni);

		System.out.println("Saldo Disponible De La Cuenta: " + Saldo_Inicial);

	}
}
