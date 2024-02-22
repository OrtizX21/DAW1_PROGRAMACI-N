package POO;

public class Llamada_Objetos {

	public static void main(String[] args) {

		Cuenta_Corriente CuentaAhorro;

		CuentaAhorro = new Cuenta_Corriente("AX345621", "Felipe Ortiz", "BBVA"); // HAGO LA LLAMADA AL CONSTRUCTOR PADRE.

		CuentaAhorro.Datos();

		CuentaAhorro.getSaldo(1000.15);
				
		// AMBOS SE VEN POR QUE UNO ESTA PUBLICO Y SE PUEDE VER DESDE OTRO PAQUETE AFUERA (DNI) Y (NOMBRED) QUE NO TIENE NINGUNA RESTRICCION
		// Y SOLO SE VE EN EL PAQUETE.
		
		CuentaAhorro.Dni = "ADWDW12123";
		CuentaAhorro.NombreD = "Mario Alfonso";
		
		// NO SE VE POR QUE ESTA EN PRIVATE 
		// CuentaAhorro.Saldo_Incial;
		
		Cuenta_Corriente CuentaPensionado;
		
		CuentaPensionado = new Cuenta_Corriente("AV125458", "Laura Rodriguez", 112154.02, ""); // HAGO LA LLAMADA AL CONSTRUCTOR SOBRECARGADO.
		
		CuentaPensionado.Datos1();
		

	}
}
