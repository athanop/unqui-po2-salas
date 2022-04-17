package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.Trabajador;

class TrabajadorTestCase {

	Trabajador trabajador;
	Ingreso ingreso1;
	Ingreso ingreso2;
	Ingreso ingreso3;
	
	@BeforeEach
	void setUp() throws Exception {
		trabajador = new Trabajador();
		ingreso1 = new Ingreso("Junio", "Sos buenisimo", 40);
		ingreso2 = new Ingreso("Junio", "Sos buenisimo", 60);
		ingreso3 = new IngresoPorHorasExtras("Mayo", "Comportamiento", 100, 5);
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
		trabajador.agregarIngreso(ingreso3);
	
	}


	@Test
	void testTotalPercibido() {
		assertEquals(trabajador.getTotalPercibido(), 200);
	}

	@Test
	void testMontoImponible() {
		assertEquals(trabajador.getMontoImponible(), 100);
	}
	
	
	@Test
	void testImpuestoAPagar() {
		assertEquals(trabajador.getImpuestoAPagar(), 2);
	}
	
	
}
