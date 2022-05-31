package ar.edu.unq.po2.tp11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp11.Encriptador.EncriptacionLetraPorNumero;
import ar.edu.unq.po2.tp11.Encriptador.EncriptacionPorVocal;
import ar.edu.unq.po2.tp11.Encriptador.EncriptadorNaive;

class EncriptadorNaiveTestCase {

	EncriptadorNaive encriptador;
	EncriptacionPorVocal encriptadorPorVocal;
	EncriptacionLetraPorNumero encriptadorLetraPorNumero;
	
	@BeforeEach
	void setUp() throws Exception {
	
	encriptadorPorVocal = new EncriptacionPorVocal();
	encriptadorLetraPorNumero = new EncriptacionLetraPorNumero();
	encriptador = new EncriptadorNaive(encriptadorPorVocal);
	
	}

	@Test
	void testUnEncriptadorRecibeLaPalabra_Salida_laEncriptaComo_Selode() {
		String textoEncriptado = encriptador.encriptar("salida");
		assertEquals("selode", textoEncriptado);
	}

	@Test
	void testUnEncriptadorRecibeLaPalabra_objetos_laEncriptaComo_ubjitus() {
		String textoEncriptado = encriptador.encriptar("objetos");
		assertEquals("ubjitus", textoEncriptado);
	}
	
	@Test
	void testUnEncriptadorRecibeLaPalabra_hulo_laDesencriptaComo_hola() {
		String textoDesencriptado = encriptador.desencriptar("hule");
		assertEquals("hola", textoDesencriptado);
	}
		
	
	@Test
	void testUnEncriptadorModificaSuEstrategiaYRecibeLaPalabra_objetos_laEncriptaComo_15_2_10_5_20_15_19() { 
		encriptador.setMetodoDeEncriptacion(encriptadorLetraPorNumero);
		String textoEncriptado = encriptador.encriptar("objetos");
		assertEquals("15,2,10,5,20,15,19", textoEncriptado);
	}
	
	@Test
	void testUnEncriptadorModificaSuEstrategiaYRecibe_15_2_10_5_20_15_19_laDesencriptaComo_objetos() { 
		encriptador.setMetodoDeEncriptacion(encriptadorLetraPorNumero);
		String textoEncriptado = encriptador.desencriptar("15,2,10,5,20,15,19");
		assertEquals("Objetos", textoEncriptado);
	}
	
	
}
