package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.MercadoCentral.Producto;


class ProductoTestCase {

	Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
		producto = new Producto("Yerba Mate", 20d);

	}

	@Test
	void testConstructorProducto() {
		assertEquals("Yerba Mate", producto.getNombre());
		assertEquals(20, producto.getPrecio());

	}
	

}
