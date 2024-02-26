package POO;


public class Gestor_Cuenta {

	public String NombGestor; // NOMBRE DEL GESTOR PREDETERMINADO.

	String TelGestor; // NUMERO DE TELEFONO DEL GESTOR.

	double ImporteMax = 0; // IMPORTE MAXIMO DE LA CUENTA.
	

	Gestor_Cuenta(String Nom, String Tel) {

		this.NombGestor = Nom;
		this.TelGestor = Tel;
		this.ImporteMax = 10000;

	}
	

	public void DatosGestor() {

		
		System.out.println("El Nombre Del Gestor De Tu Cuenta Es: " + NombGestor);

		System.out.println("El Numero De Tu Gestor Para Resolver Cualquier Incidencia Es: " + TelGestor);

		System.out.println("El Importe Maximo De Tu Cuenta Es: " + ImporteMax + " €");
	}
}
