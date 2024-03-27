package Maquinaria;
import Personal.Mecanicos;

public class Locomotoras {

	public String Matricula;
	public double Potencia;
	public Integer AñoAntiguedad;
	Mecanicos Mecanico;
	
	public Locomotoras(String matricula, double potencia, Integer añoAntiguedad, Mecanicos Mecanico) {
		
		this.Matricula = matricula;
		this.Potencia = potencia;
		this.AñoAntiguedad = añoAntiguedad;
		this.Mecanico = Mecanico;
	}		
}