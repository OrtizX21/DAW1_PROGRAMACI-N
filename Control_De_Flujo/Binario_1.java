package Control_De_Flujo;
import java.util.*;

public class Binario_1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Numero= new Scanner(System.in);
		
		System.out.print("Ingrese Un Numero Binario: "); 
		
		String Binario = Numero.next();
		
		int Decimal = Conversion(Binario);
		
		System.out.print("El equivalente en decimal es: " + Decimal); 
		
		Numero.close();

		
	}

	static int Conversion (String Binario) {
		
		int Longitud = Binario.length();
		int Decimal = 0;
		
		for (int NumPos = 0; NumPos < Longitud; NumPos++) {
			
			int Digito =  ((Binario.charAt(Longitud - 1 - NumPos)) - 48);
			
			Decimal += Digito * Math.pow(2 , NumPos);
		}
		
		
		return (Decimal);
		
	}
	
	static int Potencia (int base, int exponente) {
		
		int potencia = 1;
		
		for (int i = 0; i < exponente; i++) {
			
			potencia = potencia * base;
		}
		
		return (potencia);
	}
}
