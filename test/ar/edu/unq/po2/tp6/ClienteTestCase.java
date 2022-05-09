package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTestCase {

	Cliente cliente;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Nahuel","Salas","1234",25,235d);
		
	}

	@Test
	void testSueldoNeto() {
		assertEquals(235, cliente.getSueldoNeto());
	}

}
