package ar.edu.unq.po2.tp10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTestCase {

	EmpleadoDePlanta planta;
	EmpleadoTemporario temporario;
	EmpleadoPasante pasante;
	
	@BeforeEach
	void setUp() throws Exception {
		temporario = new EmpleadoTemporario(2, 1000, true, false);
		pasante = new EmpleadoPasante(5);
		planta = new EmpleadoDePlanta(3000, 2);
	}

	@Test
	void testSueldoBrutoEmpleadoDePlanta() {
		assertEquals(planta.sueldoBruto(), 3300);
	}

	@Test
	void testSueldoEmpleadoDePlanta() {
		assertEquals(planta.sueldo(), 2871);
	}

	@Test
	void testSueldoBrutoEmpleadoTemporario() {
		assertEquals(temporario.sueldoBruto(), 1110);
	}

	@Test
	void testSueldoEmpleadoTemporario() {
		assertEquals(temporario.sueldo(), 965.7);
	}
	
	@Test
	void testSueldoBrutoEmpleadoPasante() {
		assertEquals(pasante.sueldoBruto(), 200);
	}
	
	@Test
	void testSueldoEmpleadoPasante() {
		assertEquals(pasante.sueldo(), 174);
	}
	
}
