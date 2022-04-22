package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTestCase {

	private Cliente cliente; 
	private Producto cafe;
	private Producto yerba;
	private Producto aguaMineral;
	
	
	@BeforeEach
	void setUp() throws Exception {
		cafe = new Producto("Café", 80d);
		yerba = new Producto("Yerba", 20d);
		aguaMineral = new Producto("Agua Mineral", 95d);
		
		cliente = new Cliente();
		cliente.agregarProducto(cafe);
		cliente.agregarProducto(yerba);
		cliente.agregarProducto(aguaMineral);
	}

	@Test
	void testProductosCliente(){
		assertEquals(3, cliente.getCantidadProductos());
	}

	
}
