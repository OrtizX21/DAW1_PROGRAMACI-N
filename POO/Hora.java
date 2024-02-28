package POO;

/*Escribir un programa que lea por teclado una hora cualquiera y un número n que representa una cantidad en segundos.
  El programa mostrará la hora introducida y las n siguientes, que se diferencian en un segundo. Para ello hemos de diseñar 
  previamente la clase Hora que dispone de los atributos hora, minuto, segundo. Los valores de los atributos se controlarán mediante métodos set/get.
*/

public class Hora {

	private int Hor;

	private int Min;

	private int Seg;

	private int A;
	

	Hora(int Hor, int Min, int Seg) { // CONSTRUCTOR PADRE.

		this.Hor = Hor;
		this.Min = Min;
		this.Seg = Seg;
	}
	
	void setHor(int Hor) {

		this.Hor = Hor;
	}

	public int getHor() {

		System.out.println(Hor);
		return Hor;
	}

	void setMin(int Min) {

		this.Min = Min;

	}

	public int getMin() {

		System.out.println(Min);
		return Min;
	}

	void setSeg(int Seg) {

		this.Seg = Seg;
	}

	public int getSeg() {

		System.out.println(Seg);
		return Seg;
	}

	void setA(int A) {

		this.A = A;

		Seg = A += Seg;
	}

	public int getA() {

		System.out.println();
		return A;
	}

	void MostrarInformacion() {

		System.out.println("La Hora Es: " + Hor + " " + "Minutos: " + Min + " " + "Segundos: " + Seg);

	}

}