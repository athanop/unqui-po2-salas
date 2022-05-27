package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.Banco.Cliente;
import ar.edu.unq.po2.tp6.Banco.Propiedad;
import ar.edu.unq.po2.tp6.Banco.SistemaInformatico;
import ar.edu.unq.po2.tp6.Banco.SolicitudDeCredito;
import ar.edu.unq.po2.tp6.Banco.SolicitudDeCreditoHipotecario;
import ar.edu.unq.po2.tp6.Banco.SolicitudDeCreditoPersonal;

class BancoTestCase {

	SistemaInformatico sistema;
	Cliente cliente;
	SolicitudDeCredito solicitud;
	Propiedad garantia;
	SolicitudDeCreditoHipotecario solicitudHipotecaria;
	Cliente cliente1;
	
	@BeforeEach
	void setUp() throws Exception {
		garantia = new Propiedad("Propiedad de sofi", "Pepe Sueldo al 123", 500d);
		sistema = new SistemaInformatico();
		sistema.agregarCliente(cliente);
		sistema.agregarCliente(cliente1);
		cliente = new Cliente("Nahuel","Salas","1234",20,235d);
		cliente1 = new Cliente("Marcos","Salas","2222",80,235d);
		solicitud = new SolicitudDeCreditoPersonal(cliente, 20d, 5);
		solicitudHipotecaria = new SolicitudDeCreditoHipotecario(cliente1, 20d, 5, garantia);
		
	}

	@Test
	void testRegistrarSolicitud() {
		
		cliente.solicitarPrestamo(sistema, solicitud);
		assertEquals(20d, solicitud.getMontoSolicitado());
		assertEquals(5, solicitud.getPlazoEnMeses());
		
	}
	
	@Test
	void testEvaluarSolicitudDePrestamo() {
		cliente1.solicitarPrestamo(sistema, solicitudHipotecaria);
		sistema.evaluarSolicitud(solicitudHipotecaria);
		assertFalse(solicitudHipotecaria.esAceptable());
	}

}
