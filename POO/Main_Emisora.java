package POO;

public class Main_Emisora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Radio Radio1 = new Radio ();
		
		Radio1.Up();
		System.out.println("Tropicana: " + Radio1.Display() );
		
		Radio Radio2 = new Radio ();
		
		Radio2.Down();
		Radio2.Down();
		System.out.println("Olimpica: " + Radio2.Display() );


	}

}
