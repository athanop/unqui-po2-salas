package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTestCase {

	ProductoCooperativa leche;
	ProductoCooperativa miel;
	
	@BeforeEach
	void setUp() throws Exception {
		leche = new ProductoCooperativa("leche", 100d);
		miel = new ProductoCooperativa("miel", 50d);
	}

	@Test
	void testPrecio() {
		assertEquals(90d, leche.getPrecio());
		assertEquals(45d, miel.getPrecio());
	}

}
