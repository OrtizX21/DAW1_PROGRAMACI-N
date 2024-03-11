package POO;

public class Main_Alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//10
		Alumno Alum1;
		Alum1 = new Alumno ("111111111T");
		
		//12
		Alum1.setNombre("Federico Pain Pain");
		
		//13
		Alum1.SetNota1(7.5);
		Alum1.GetNota1();
		Alum1.SetNota2(8.5);
		Alum1.SetNota3(9.5);
		
		//14
		Alum1.Informacion();
		
		//15
		Alum1.getNombre();
		System.out.println("Nombre: " + Alum1.getNombre());
		
		//11
		Alumno Alum2;
		Alum2 = new Alumno ("222222222T", "Pepe Garcia Sanz");
		
		//16
		Alum2.getDni();
		
		Alum2.Informacion();
		
	}

}
