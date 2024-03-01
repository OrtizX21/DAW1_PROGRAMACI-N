package POO;

public class Main_Comic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comic Comic1;
		
		Comic1 = new Comic ("Hajime No Ippo", 1078, 20, 4);
		
		Comic1.Prestamo(5);
		Comic1.Info();
		
		System.out.println();
		
		Comic1.Devolucion(3);
		Comic1.Info();
		

	}

}
