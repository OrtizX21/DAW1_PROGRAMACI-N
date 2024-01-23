package Entornos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Prueba_Calculator {

	static Calculator calc = null;
	
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		calc = new Calculator();
		System.out.println("Operaciones Previas, Creación De La Función");
	}

	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("Operaciones Tras Las Pruebas");
	}

	
	@Test
	void test() {
		
		assertEquals(3, calc.add(1, 3));
	}

}
