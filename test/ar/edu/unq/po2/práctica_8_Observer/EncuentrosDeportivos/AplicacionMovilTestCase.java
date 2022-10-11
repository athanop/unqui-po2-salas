package ar.edu.unq.po2.práctica_8_Observer.EncuentrosDeportivos;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AplicacionMovilTestCase {

	AplicacionMovil app;
	AdmDePartido adm;
	Partido partido;
	
	@BeforeEach
	void setUp() throws Exception {
		adm = mock(AdmDePartido.class);
		app = new AplicacionMovil(adm);
		
	}
	
	@Test
	void testUnaAppSeSuscribeAlDeporteBasquet() {
		app.suscribir("Basquet");
		verify(adm).suscribir(app, "Basquet");
	}
	
	@Test
	void testUnaAppSeDesuscribeAlDeporteBasquet() {
		app.suscribir("Basquet");
		app.desuscribir("Basquet");
		verify(adm).desuscribir(app, "Basquet");
	}

	@Test
	void testUnServidorEsNotificadoSobreElDeporteDeSuInteres() {
		app.suscribir("Basquet");
		app.update("Basquet");
		
		//verify
		assertEquals(app.getInformacion().size(), 1);
	}
}
