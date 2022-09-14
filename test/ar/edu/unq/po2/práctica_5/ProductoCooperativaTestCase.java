package ar.edu.unq.po2.práctica_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_5.MercadoCentral.ProductoCooperativa;

class ProductoCooperativaTestCase {

	ProductoCooperativa producto;
	
	@BeforeEach
	void setUp() throws Exception {

		producto = new ProductoCooperativa("Agua", 10d);
		
		
	}

	@Test
	void testConstructorDelProductoCooperativa() {
		assertEquals("Agua", producto.getNombre());
		assertEquals(9, producto.getPrecio());
	}

}
