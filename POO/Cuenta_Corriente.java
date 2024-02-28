package POO;


//CON EL PUBLIC SE PUEDEN VER ATRIBUTOS Y METODOS DESDE CUALQUIER CLASE
	// (CARPETA O PAQUETE).
	
	// CON EL PRIVATE SOLO SE PUEDEN VER METODOS Y ATRIBUTOS DENTRO DESDE ESE MISMA
	// RUTA O CARPETA.
	// Y SIN NINGUNO DE ELLOS SE VEN SOLO DENTRO DE ESE MISMO PAQUETE.


class Cuenta_Corriente {

	String Dni; // DNI TITULAR.

	public String NombreD; // NOMBRE TITULAR.

	public String NombreP; // NOMBRE PERSONA.

	private double Saldo_Inicial; // SALDO INCIAL DE LA CUENTA.

	static String Banco = "BBVA"; // BANCO PREDETERMINADO NOMBRE DEL BANCO DEL TITULAR Y PERSONA.

	static private String BancoNuevo; // METODO PARA CAMBIARLE EL NOMBRE AL BANCO PREDETERMINADO.

	Gestor_Cuenta gestor;
	
	
	public Cuenta_Corriente() { // ASIGNACION VALORES CONSTRUCTOR.

		Dni = "";
		NombreD = "";
		Saldo_Inicial = 0;
		Banco = "";

	}
		
	
	Cuenta_Corriente(String Dni, String Nombre, Gestor_Cuenta gestor) { // CONSTRUCTOR PADRE.

		this.Dni = Dni;
		this.NombreD = Nombre;
		this.gestor = gestor;

	}
	
	public Cuenta_Corriente(String Dni, String Nombre) { // CONSTRUCTOR SOBRECARGADO.

		this.Dni = Dni;
		this.NombreD = Nombre;

	}
	
	public void setGestor(Gestor_Cuenta Asigna) {

		this.gestor = Asigna;

	}
	
	void informacionG () {
		
		if (gestor == null) {
			
			System.out.println("Cuenta Sin Gestor");
			
			System.out.println("Nombre Del Titular De La Cuenta: " + NombreD);
			 
			System.out.println("Dni Del Titular: " + Dni);
						
		}
		
		else {
			
			System.out.println("Nombre Del Titular De La Cuenta: " + NombreD);
			 
			System.out.println("Dni Del Titular: " + Dni);
			
			System.out.println("Informacion Del Gestor: ");
			
			gestor.DatosG();
			
			System.out.println();
		
	
		}
	}
	

	public double getSaldo(double Saldo_Inicial) {

		if (Saldo_Inicial >= 0) {

			this.Saldo_Inicial = Saldo_Inicial;

		}

		System.out.println("El Saldo De Tu Cuenta Es: " + Saldo_Inicial + " €");

		return Saldo_Inicial;
	}

	// METODO PARA DARLE VALOR A EL BANCO.

	public void setBanco(String Banco) {

		BancoNuevo = Banco;
	}

	// METODO PARA RECIBIR EL VALOR DE BANCO.

	public String getBanco() {

		System.out.println("Nombre Del Banco Predeterminado: " + Banco);

		return Banco;

	}
	
	
	public void Datos1() {// FUNCION PARA VER LOS VALORES ASIGNADOS EN LA OTRA CLASE (CONSTRUCTOR
		// SOBRECARGADO).

		System.out.println("Nombre: " + NombreP);

		System.out.println("Dni: " + Dni);

		System.out.println("Saldo Disponible De La Cuenta: " + Saldo_Inicial);

		System.out.println("Cambio De Banco AHora Perteneces: " + BancoNuevo);

	}
	
}
