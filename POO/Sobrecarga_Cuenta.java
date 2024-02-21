package POO;

public class Sobrecarga_Cuenta {

	public static void main(String[] args) {

		CuentaCorriente CuentaAhorro;

		CuentaAhorro = new CuentaCorriente("AX345621", "Felipe Ortiz"); // cuenta de Pepe)

		CuentaAhorro.Datos();

		CuentaAhorro.getSaldo(1000.15);
		
		
		CuentaCorriente CuentaPensionado;
		
		CuentaPensionado = new CuentaCorriente("AV125458", "Laura Rodriguez", 112154.02);
		
		CuentaPensionado.Datos1();
		

	}
}