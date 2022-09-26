package ar.edu.unq.po2.práctica_6.BancoYPrestamos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {

	Banco banco;	
	SistemaInformatico sistema;
	Cliente cliente;
	SolicitudDeCredito creditoPersonal;
	
	@BeforeEach
	void setUp() throws Exception {
		cliente = new Cliente("Marcos", "1243", 23, 13d, 30d);
		creditoPersonal = new CreditoPersonal(cliente, 20d, 3);
		
		banco = new Banco();
		

	}

	@Test
	void testElBancoAgregaUnClientePorMedioDelSistemaInformatico() {
		banco.agregarCliente(cliente);
		assertEquals(banco.getClientes().size(), 1);
	}

	@Test
	void testElBancoAgregaUnaSolicitudPorMedioDelSistemaInformatico() {
		banco.agregarSolicitud(creditoPersonal);
		assertEquals(banco.getSolicitudes().size(), 1);
	}
	
	@Test
	void testElSistemaInformaticoDelBancoConoceElMontoTotal() {
		cliente = new Cliente("Marcos", "1243", 23, 200000d, 16000d);
		creditoPersonal = new CreditoPersonal(cliente, 20d, 3);
		banco.agregarSolicitud(creditoPersonal);
		assertEquals(banco.montoTotal(), 20d);
	}
	

}
