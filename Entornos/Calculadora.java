package Entornos;

import java.util.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}

	public Integer add(int i, int j) {
		// TODO Auto-generated method stub
		
		System.out.println("!Hola Bienvenido A Calculadora¡\n");

		Scanner Calculadora = new Scanner(System.in);

		System.out.println("Introduce El Primer Valor De La Operación:");
		int Num1 = Calculadora.nextInt();

		System.out.println("Introduce El Segundo Valor De La Operación:");
		int Num2 = Calculadora.nextInt();

		System.out.println("Selecciona La Operación:");
		System.out.println(" 1: DIVISION  ||  2: SUMA  ||  3: RESTA  ||  4: MULTIPLICACION");
		int Operacion = Calculadora.nextInt();
		

		Calculadora.close();
		

		if (Operacion == 1) {

			int Division = Num1 / Num2;
			System.out.println("El Resultado De La División Es: " + Division);
			return Division;
		}

		if (Operacion == 2) {

			int Suma = Num1 + Num2;
			System.out.println("El Resultado De La Suma Es: " + Suma);
			return Suma;
		}

		if (Operacion == 3) {

			int Resta = Num1 - Num2;
			System.out.println("El Resultado De La Resta Es: " + Resta);
			return Resta;
		}
		
		if (Operacion == 4) {

			int Mult = Num1 * Num2;
			System.out.println("El Resultado De La Multiplicación Es: " + Mult);
			return Mult;
		}
		
		if (Operacion <= 0 || Operacion >= 5) {
			
			System.out.println("!ERROR999¡");
		}
		
		return Operacion;
	}

	

}