package ar.edu.unq.po2.práctica_clase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgendaTestCase {

	Agenda agenda;
	
	@BeforeEach
	void setup(){
		agenda = new Agenda();
	}
	

	@Test
	void testTieneAlMenosUnNombreQueEmpiezaCon() {
		agenda.agregarElemento("alan");
		agenda.agregarElemento("fepe");
		assertTrue(agenda.tieneAlMenosUnConStreams("al"));
		assertTrue(agenda.tieneAlMenosUnNombreQueEmpiezaCon("al"));
			
	}
	
	
	@Test
	void testTodosEmpiezanCon() {
		agenda.agregarElemento("alan");
		agenda.agregarElemento("atre");
		agenda.agregarElemento("aepe");
		assertTrue(agenda.todosEmpiezanConStream("a"));
		assertTrue(agenda.todosEmpiezanCon("a"));
			
	}
	
	
	@Test
	void testFiltrar() {
		
		agenda.agregarElemento("alan");
		agenda.agregarElemento("ftre");
		agenda.agregarElemento("aepe");
		
		agenda.filtrar("alan");
		assertEquals(agenda.filtrarConStream("ft").size(), 1);
		assertEquals(agenda.filtrar("ft").size(), 1);
	}
	
	
	@Test
	void testPrintAll() {
		//lo dejo documentado para no tener la consola todo el tiempo
		//agenda.agregarElemento("alan");
		//agenda.agregarElemento("ftre");
		//agenda.agregarElemento("aepe");

		//agenda.printAll();
		
	}
	
	
	
	
	
}
