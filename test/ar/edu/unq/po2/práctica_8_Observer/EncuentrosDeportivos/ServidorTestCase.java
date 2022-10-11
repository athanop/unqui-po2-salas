package ar.edu.unq.po2.práctica_8_Observer.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServidorTestCase {

	Servidor servidor;
	AdmDePartido adm;
	
	@BeforeEach
	void setUp() throws Exception {
		adm = mock(AdmDePartido.class);
		servidor = new Servidor(adm);
		
	}

	@Test
	void testUnServidorSeSuscribeAlDeporteFutbol() {
		servidor.suscribir("Futbol");
		verify(adm).suscribir(servidor, "Futbol");
	}
	
	@Test
	void testUnServidorSeDesuscribeAlDeporteFutbol() {
		servidor.suscribir("Futbol");
		servidor.desuscribir("Futbol");
		verify(adm).desuscribir(servidor, "Futbol");
	}

	@Test
	void testUnServidorEsNotificadoSobreElDeporteDeSuInteres() {
		servidor.update("Futbol");
		assertEquals(servidor.getInformacionDeporte().size(), 1);
	}
}
