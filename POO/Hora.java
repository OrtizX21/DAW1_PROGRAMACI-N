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

	Hora(int Hor,int Min,int Seg) { // CONSTRUCTOR PADRE.

		/*
		 * if (Seg <= 0 || Seg <= 58) {
		 * 
		 * Seg ++; }
		 */
		
		
		if (Min == 59 && Seg == 59) {
			
			Hor ++;
			Min = 00;
			Seg = 00;
		}


		if (Hor == 24) {

			Hor = 0;
		}

		
		this.Hor = Hor;
		this.Min = Min;
		this.Seg = Seg;
		
		
	}

	void setHor(int Hor) {

		if (Hor <= 0 && Hor <= 23) {
		this.Hor = Hor;
		}
		
		else {
			
			this.Hor = 0;
		}
	}

	public int getHor() {

		if (Hor >= 0 && Hor <= 9) {
			
			System.out.println("La Hora Es: 0" + Hor);

		}
		
		else {
			
			System.out.println("La Hora Es: " + Hor);			
		}

		return Hor;
	}

	void setMin(short Min) {

		if (Min <= 0 && Min <= 59) {
		this.Min = Min;
		}
		
		else {
			
			this.Min = 0;
		}

	}

	public int getMin() {
	
		if (Min >= 0 && Min <= 9) {
			
			System.out.println("Los Minutos Son: 0" + Min);

		}
		
		else {
			
			System.out.println("Los Minutos Son: " + Min);			
		}

		return Min;
	}

	void setSeg(int Seg) {

		if (Seg <= 0 && Seg <= 59) {
		this.Seg = Seg;
		}
		
		else {
			
			this.Seg = 0;
		}
	}

	public int getSeg() {

		if (Seg >= 0 && Seg <= 9) {
			
			System.out.println("Los Segundos Son: 0" + Seg);

		}
		
		else {
			
			System.out.println("Los Segundos Son: " + Seg);			
		}
		
		return Seg;
	}

	void setA(int A) {

		this.A = A;

		Seg = A += Seg;
	}

	public int getA() {

		if (A >= 0 && A <= 9) {
			
			System.out.println("La Suma De Los Segundos Es: 0" + A);

		}
		
		else {
			
			System.out.println("La Suma De Los Segundos Es: " + A);			
		}
		
		return A;
	}

	void MostrarInformacion() {

		if (Hor >= 24 || Min >= 60 || Seg >= 60) {
			
			System.out.println("Operacion Invalida");
		}
		
		else if (Hor >= 12 && Hor <= 23 && Min >= 0 && Min <= 9 && Seg >= 0 && Seg <= 9){
			
			System.out.println("La Hora Es: " + "" + Hor  + " Minutos: " + "0" + Min + " Segundos: " + "0" + Seg);

		}
		
		else if (Hor >= 0 && Hor <= 9 && Min >= 0 && Min <= 9 && Seg >= 0 && Seg <= 9) {
			
			System.out.println("La Hora Es: " + "0" + Hor + " Minutos: " + "0" + Min + " Segundos: " + "0" + Seg);

		}
		
		else if (Hor >= 0 && Hor <= 9 && Seg >= 0 && Seg <= 9)  {
			
			System.out.println("La Hora Es: " + "0" + Hor  + " Minutos: " + "" + Min + " Segundos: " + "0" + Seg);
			
		}
		
		else if (Hor >= 0 || Hor <= 9 || Min >= 0 && Min <= 9 || Seg >= 0 || Seg <= 9)  {
			
			System.out.println("La Hora Es: " + "0" + Hor  + " Minutos: " + "" + Min + " Segundos: " + "" + Seg);
			
		}
		
		else if (Hor >= 12 && Hor <= 23 && Min >= 10 && Min <= 59 && Seg >= 0 && Seg <= 9) {
			
			System.out.println("La Hora Es: " + "" + Hor  + " Minutos: " + "" + Min + " Segundos: " + "0" + Seg);			
		}
		
		else if (Hor <= 12 && Hor <= 23 && Min >= 0 && Min <= 9 && Seg >= 0 && Seg <= 9) {
			
			System.out.println("La Hora Es: " + "" + Hor  + " Minutos: " + "0" + Min + " Segundos: " + "0" + Seg);			
		}
		
		else if (Hor >= 10 && Min >= 10 && Min <= 59 && Seg >= 0 && Seg <= 9 ) {
			
			System.out.println("La Hora Es: " + "" + Hor  + " Minutos: " + "" + Min + " Segundos: " + "0" + Seg);			
		}
		
		else if (Hor >= 10 && Min >= 10 && Min <= 59 && Seg >= 0 && Seg <= 59 ) {
			
			System.out.println("La Hora Es: " + "" + Hor  + " Minutos: " + "" + Min + " Segundos: " + "" + Seg);			
		}
		
		else if (Hor >= 10 || Hor <= 23 && Min >= 0 && Min <= 9 && Seg >= 0 && Seg <= 9 ) {
			
			System.out.println("La Hora Es: " + "" + Hor  + " Minutos: " + "0" + Min + " Segundos: " + "" + Seg);			
		}
	}

}
