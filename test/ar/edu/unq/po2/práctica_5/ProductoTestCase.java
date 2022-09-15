package ar.edu.unq.po2.práctica_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_5.MercadoCentral.Producto.Producto;

class ProductoTestCase {

	Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
	
		producto = new Producto("Yerba", 20d);
	
	}

	@Test
	void testConstructorDelProducto() {
		assertEquals("Yerba", producto.getNombre());
		assertEquals(20d, producto.getPrecio());
	}

}