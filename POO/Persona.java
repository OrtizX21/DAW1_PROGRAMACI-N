package POO;

public class Persona {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		class persona {
			
			int edad;
			double estatura;
			String apellido;
			
			//static String pelo;
			// CON EL STATIC ES UN VALOR PRIVADO QUE SE COMPARTE PARA TODOS LOS OBJETOS
			
			public void saludar() {
				// TODO Auto-generated method stub
				
				System.out.println("Hola mi apellido es: " + apellido);
				System.out.println("Encantado");
			}
			
			public void birthday (int cumpleaños) {
				
				cumpleaños = cumpleaños + edad;
				System.out.println("Ahora tengo estos años: " + cumpleaños);
			}
			
			public void crecer (double incremento) {
				
				estatura = estatura + incremento;
				System.out.println("Mi estatura ha aumentado: " + estatura);
			}
			
		}
		
		persona jaime = new persona();
		
		jaime.edad = 18;
		jaime.estatura = 1.78;
		jaime.apellido = "Orozco";
		
		System.out.println(jaime.edad);
		System.out.println(jaime.estatura);
		System.out.println(jaime.apellido);
		
		jaime.saludar();
		jaime.birthday(2);
		jaime.crecer(0.05);
		

		
	}

}
