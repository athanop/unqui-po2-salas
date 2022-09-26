package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolicitudDeCreditoTestCase {

	SolicitudDeCredito creditoPersonal, creditoHipotecario;
	Cliente cliente;
	Propiedad propiedad;
	@BeforeEach
	void setUp() throws Exception {
	
		cliente = new Cliente("Marcos", "1243", 23, 403d, 30d);
		creditoPersonal = new CreditoPersonal(cliente, 20d, 3);
		creditoHipotecario = new CreditoHipotecario(cliente, 30d, 4, propiedad);
	}

	@Test
	void testCreditoPersonalNoAceptable() {
		assertFalse(creditoPersonal.esAceptable());
	}
	
	@Test
	void testCreditoPersonalAceptable() {
		cliente = new Cliente("Marcos", "1243", 23, 200000d, 16000d);
		creditoPersonal = new CreditoPersonal(cliente, 20d, 3);
		assertTrue(creditoPersonal.esAceptable());
	}
	
	@Test
	void testCreditoHipotecarioNoAceptable() {
		assertFalse(creditoHipotecario.esAceptable());
	}
	
	@Test
	void testCreditoHipotecarioAceptable() {
		propiedad = new Propiedad("desc", "1224", 20d);
		cliente = new Cliente("Marcos", "1243", 23, 43d, 50d);
		creditoHipotecario = new CreditoHipotecario(cliente, 10d, 4, propiedad);
		assertTrue(creditoHipotecario.esAceptable());
	}

}
