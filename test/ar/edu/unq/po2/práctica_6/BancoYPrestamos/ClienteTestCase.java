package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTestCase {

	
	Cliente cliente;
	
	@BeforeEach
	void setUp() throws Exception {
	
		cliente = new Cliente("Marcos", "1243", 23, 403d, 30d);
	}

	@Test
	void testConstructorDelCliente() {
		assertEquals(cliente.getEdad(), 23);
		assertEquals(cliente.getNetoAnual(), 403d);
		assertEquals(cliente.getNetoMensual(), 30d);
		assertEquals(cliente.getNombre(), "Marcos");
	}

}
