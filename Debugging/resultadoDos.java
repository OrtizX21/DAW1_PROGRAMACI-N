package Debugging;
public class resultadoDos {
	public static void main(String[] args) {
		
		int aux=0;
	    int escalones=3;
	    int alturaEscalon=2;
	   
	    for (int i = 1; i <= escalones; i++) {
	    	
	       for (int j = 1; j <= alturaEscalon; j++) {
	    	   
	           for (int k = 0; k < i; k++) {
	        	   
	               System.out.print("***");
	           }
	           
	           System.out.println();
		} 
	       aux = 0; // ESTO ES PARA QUE PARA EL DEBUG NO TENER EN CUENTA.
	}
}}