package POO;

public class Llamada_Objetos {

	public static void main(String[] args) {

		Cuenta_Corriente CuentaAhorro;

		CuentaAhorro = new Cuenta_Corriente("AX345621", "Felipe Ortiz"); // HAGO LA LLAMADA AL CONSTRUCTOR PADRE.

		CuentaAhorro.setBanco("Santander");

		CuentaAhorro.getBanco();

		CuentaAhorro.Datos();

		CuentaAhorro.getSaldo(8000);

		// AMBOS SE VEN POR QUE UNO ESTA PUBLICO Y SE PUEDE VER DESDE OTRO PAQUETE
		// AFUERA (DNI) Y (NOMBRED) QUE NO TIENE NINGUNA RESTRICCION
		// Y SOLO SE VE EN EL PAQUETE.

		CuentaAhorro.Dni = "AM12343";

		CuentaAhorro.NombreD = "USUARIO EJEMPLO";

		// NO SE VE POR QUE ESTA EN PRIVATE
		// CuentaAhorro.Saldo_Incial;
		// SOBRECARGA DEL OBJETO CUENTA DE BANCO.
		/*
		 * Cuenta_Corriente CuentaPensionado;
		 *
		 * CuentaPensionado = new Cuenta_Corriente("AV125458", "Laura Rodriguez",
		 * 112154.02, "Caixa"); // HAGO LA LLAMADA AL CONSTRUCTOR SOBRECARGADO.
		 *
		 * CuentaPensionado.getBanco();
		 *
		 * CuentaPensionado.Datos1();
		 *
		 * CuentaPensionado.setBanco("Santander");
		 */
	}
}
