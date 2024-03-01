package POO;

public class Main_Comic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Comic Comic1, Comic2, Comic3;
		
		Comic1 = new Comic ("Hajime No Ippo", 179, 20, 4);
		
		Comic1.Prestamo();
		Comic1.Info();
		
		System.out.println();
		
		Comic1.Devolucion();
		Comic1.Info();
		
		System.out.println();
		
		//////////////////////////////////////////////////////////////////
		
		Comic2 = new Comic ("Ashita No Joe", 180, 0, 9);
		
		Comic2.Info();
		
		System.out.println();
		
		//////////////////////////////////////////////////////////////////

		Comic3 = new Comic ("One Piece", 181, 10, 0);
		
		Comic3.Info();

	}

}
