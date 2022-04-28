package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FacturaTestCase {

	FacturaDeServicio facturaDeServicio;
	FacturaDeImpuesto facturaDeImpuesto;
	
	@BeforeEach
	void setUp() throws Exception {
		facturaDeServicio = new FacturaDeServicio(20,10);
		facturaDeImpuesto = new FacturaDeImpuesto(20);
	}

	@Test
	void testMontoAPagarFacturaDeServicio() {
		assertEquals(200, facturaDeServicio.montoAPagar());
	}

	@Test
	void testMontoAPagarFacturaDeImpuesto() {
		assertEquals(20, facturaDeImpuesto.montoAPagar());
	}
	

	
}
