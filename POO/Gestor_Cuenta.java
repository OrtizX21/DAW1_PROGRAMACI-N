package POO;

public class Gestor_Cuenta {

	public String NombGestor; // NOMBRE DEL GESTOR PREDETERMINADO.

	private String TelGestor; // NUMERO DE TELEFONO DEL GESTOR.

	private double ImporteMax = 0; // IMPORTE MAXIMO DE LA CUENTA.

	public Gestor_Cuenta(String NombGestor, String TelGestor) {

		this.NombGestor = NombGestor;
		this.TelGestor = TelGestor;
		this.ImporteMax = 10000;

	}

	public void DatosGestor() {

		System.out.println("El Nombre Del Gestor De Tu Cuenta Es: " + NombGestor);

		System.out.println("El Numero De Tu Gestor Para Resolver Cualquier Incidencia Es: " + TelGestor);

		System.out.println("El Importe Maximo De Tu Cuenta Es: " + ImporteMax + " €");
	}
}
