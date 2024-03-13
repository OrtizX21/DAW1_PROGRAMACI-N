package POO;

public class Main_Cafetera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Cafetera 1:");
		Cafetera Cafe1;
		Cafe1 = new Cafetera ();
		System.out.println(Cafe1);

		//////////////////////////////////////////////////////

		System.out.println("Cafetera 2:");
		Cafetera Cafe2;
		Cafe2 = new Cafetera (1500);
		Cafe2.info();
		System.out.println();

		//////////////////////////////////////////////////////

		System.out.println("Cafetera 3:");
		Cafetera Cafe3;
		Cafe3 = new Cafetera (150, 1000);
		Cafe3.info();
		Cafe3.servirTaza(100);
		Cafe3.info();
		System.out.println();

		//////////////////////////////////////////////////////

		System.out.println("Cafetera 4:");
		Cafetera Cafe4;
		Cafe4 = new Cafetera (2000, 1500);
		Cafe4.llenarCafetera();
		Cafe4.info();
		Cafe4.vaciarCafetera();
		Cafe4.info();
	}

}
