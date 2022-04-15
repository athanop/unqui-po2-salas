package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Ingreso;
import ar.edu.unq.po2.tp4.IngresoBasico;
import ar.edu.unq.po2.tp4.IngresoPorHorasExtras;

class IngresoTestCase {

	Ingreso ingreso;
	IngresoPorHorasExtras ingresoPorHorasExtras;
	
	
	@BeforeEach
	void setUp() throws Exception {
		ingreso = new IngresoBasico("Junio","Comportamiento", 40);
		ingresoPorHorasExtras = new IngresoPorHorasExtras("Junio", "Comportamiento", 0, 4);
	}

	@Test
	void testImpuestoIngreso() {
		assertEquals(ingreso.impuestoPorIngreso(), 0.8);
		assertEquals(ingresoPorHorasExtras.impuestoPorIngreso(), 0);
	}

}
