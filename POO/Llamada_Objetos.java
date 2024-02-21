package POO;

public class Llamada_Objetos {

	public static void main(String[] args) {

		Cuenta_Corriente CuentaAhorro;

		CuentaAhorro = new Cuenta_Corriente("AX345621", "Felipe Ortiz"); // HAGO LA LLAMADA AL CONSTRUCTOR PADRE.

		CuentaAhorro.Datos();

		CuentaAhorro.getSaldo(1000.15);
		
		
		Cuenta_Corriente CuentaPensionado;
		
		CuentaPensionado = new Cuenta_Corriente("AV125458", "Laura Rodriguez", 112154.02); // HAGO LA LLAMADA AL CONSTRUCTOR SOBRECARGADO.
		
		CuentaPensionado.Datos1();
		

	}
}