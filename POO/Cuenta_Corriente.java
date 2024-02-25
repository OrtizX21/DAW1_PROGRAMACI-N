package POO;

//import java.util.*;

/*En la clase CuentaCorriente sobrecargar los constructores para poder crear objetos
- con el DNI del titular de la cuenta y un saldo inicial
- con el DNI, nombre y el saldo inicial
Escribir un programa que compruebe el funcionamiento de los métodos*/


public class Cuenta_Corriente {
	String Dni; // DNI TITULAR.
	
	public String NombreD; // NOMBRE TITULAR.
	
	public String NombreP; // NOMBRE PERSONA.
	
	private double Saldo_Inicial; // SALDO INCIAL DE LA CUENTA.
	
	static String Banco = "BBVA"; // BANCO PREDETERMINADO NOMBRE DEL BANCO DEL TITULAR Y PERSONA.
	
	static private String BancoNuevo; // METODO PARA CAMBIARLE EL NOMBRE AL BANCO PREDETERMINADO.
	
	public static String NombreGestor = "Luisa Fernanda Ayala"; // NOMBRE DEL GESTOR PREDETERMINADO.
	
	public final String NumeroGestor = "+34 641 12 68 35"; // NUMERO DEL GESTOR PREDEERMINADO.
	
	int ImporteMax = 10000; // IMPORTE MAXIMO DE LA CUENTA.
	
	
	Cuenta_Corriente(String Dni, String Nombre) { // CONSTRUCTOR PADRE.
		
		this.Dni = Dni;
		this.NombreD = Nombre;
		
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
		Banco = "";
		
	}
	
	public Cuenta_Corriente(String Dni, String NombreP, double Saldo_Inicial, String Banco) { // SOBRECARGA CONSTRUCTOR.
		
		this.Dni = Dni;
		this.NombreP = NombreP;
		this.Saldo_Inicial = Saldo_Inicial;
		
	}
	
	public double getSaldo(double Saldo_Inicial) {
		
		if (Saldo_Inicial >= 0) {
			
			this.Saldo_Inicial = Saldo_Inicial;
			
		}
		
		System.out.println("El Saldo De Tu Cuenta Es: " + Saldo_Inicial + " €");
		
		return Saldo_Inicial;
	}
	
	// METODO PARA DARLE VALOR A EL BANCO.
	
	public void setBanco (String Banco) {
		
		BancoNuevo = Banco;
	}
	
	// METODO PARA RECIBIR EL VALOR DE BANCO.
	
	public String getBanco() {
		
		System.out.println("Nombre Del Banco Predeterminado: " + Banco);
		
		return Banco;
		
	}
	
	void Datos() {// FUNCION PARA VER LOS VALORES ASIGNADOS EN LA OTRA CLASE (CONSTRUCTOR PADRE).
		
		System.out.println("Nombre: " + NombreD);
		
		System.out.println("Dni: " + Dni);
		
		System.out.println("Cambio De Banco AHora Perteneces: " + BancoNuevo);
		
		System.out.println("El Nombre Del Gestor De Tu Cuenta Es: " + NombreGestor);
		
		System.out.println("El Numero De Tu Gestor Para Resolver Cualquier Incidencia Es: " + NumeroGestor);
		
		System.out.println("El Importe Maximo De Tu Cuenta Es: " + ImporteMax + " €");
	}
	
	void Datos1() {// FUNCION PARA VER LOS VALORES ASIGNADOS EN LA OTRA CLASE (CONSTRUCTOR
					// SOBRECARGADO).
		
		System.out.println("Nombre: " + NombreP);
		
		System.out.println("Dni: " + Dni);
		
		System.out.println("Saldo Disponible De La Cuenta: " + Saldo_Inicial);
				
		System.out.println("Cambio De Banco AHora Perteneces: " + BancoNuevo);
		
	}
	
	// DATOS DE LA PERSONA QUE LLAMO DESDE EL OTRO PAQUETE.
	
	public void Datos2() {// FUNCION QUE HAGO PARA MOSTRAR LOS DATOS DESDE OTRO PAQUETE AFUERA.
		
		System.out.println("Nombre: " + NombreP);
		
		System.out.println("Dni: " + Dni);
		
		System.out.println("Cambio De Banco AHora Perteneces: " + BancoNuevo);
		
		System.out.println("El Nombre Del Gestor De Tu Cuenta Es: " + NombreGestor);
		
		System.out.println("El Numero De Tu Gestor Para Resolver Cualquier Incidencia Es: " + NumeroGestor);
		
		System.out.println("El Importe Maximo De Tu Cuenta Es: " + ImporteMax + " €");
	}
}
