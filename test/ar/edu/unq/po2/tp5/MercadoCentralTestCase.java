package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoCentralTestCase {

	MercadoCentral mercado;
	Cliente cliente1;
	Producto miel;
	Producto miel2;
	Producto miel3;
	Caja caja1;
	Caja caja2;
	
	
	@BeforeEach
	void setUp() throws Exception {
		//productos
		miel = new Producto("Miel", 85d);
		miel3 = new Producto("Miel", 85d);
		miel2 = new Producto("Miel", 85d);
		
		//mercado
		mercado = new MercadoCentral();
		mercado.agregarCaja(caja1);
		mercado.agregarCaja(caja2);
		mercado.agregarProducto(miel);
		mercado.agregarProducto(miel2);
		mercado.agregarProducto(miel3);
		mercado.agregarStock(mercado.cantidadDeStock(miel));
		
		
		//cajas
		caja1 = new Caja();
		caja2 = new Caja();
		
		
		//clientes
		cliente1 = new Cliente();
		cliente1.agregar(miel);
		
	
	}

	@Test
	void testCantidadDeCajas() {
		assertEquals(2, mercado.cantidadDeCajas());
	}

	@Test
	void testHayStock() {
		assertTrue(mercado.hayStock(miel));
	}
	
	@Test
	void testCantidadDeMiel() {
		assertEquals(3, mercado.cantidadDeStock(miel));
	}


	
}
