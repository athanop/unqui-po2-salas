package ar.edu.unq.po2.práctica_5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_5.MercadoCentral.Cliente;
import ar.edu.unq.po2.práctica_5.MercadoCentral.Producto.Producto;

class ClienteTestCase {

	Cliente cliente;
	Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
	
		cliente = new Cliente();
		producto = new Producto("Yerba", 20d);
	}

	@Test
	void testUnClienteAgregaUnProductoASuCompra() {
		cliente.agregarProducto(producto);
		assertEquals(1, cliente.getProductos().size());
	}
	
	@Test
	void testUnClienteEliminaUnProductoDeSuCompra() {
		cliente.agregarProducto(producto);
		cliente.agregarProducto(producto);
		cliente.eliminarProducto(producto);
		assertEquals(1, cliente.getProductos().size());
	}

}
