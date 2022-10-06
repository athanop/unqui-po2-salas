package ar.edu.unq.po2.práctica_8_Composite;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_8_Composite.FileSystem.Archivo;
import ar.edu.unq.po2.práctica_8_Composite.FileSystem.Directorio;

class DirectorioTestCase {

	Directorio directorio, directorio2, directorio3;
	Archivo archivo1, archivo2;
	
	@BeforeEach
	void setUp() throws Exception {
		
		directorio = new Directorio("Carpeta1", LocalDate.of(2020, 5, 14));
		directorio2 = new Directorio("Carpeta2", LocalDate.of(2022, 6, 17));
		directorio3 = new Directorio("Carpeta3", LocalDate.of(2005, 5, 14));
		archivo1 = new Archivo("Pepe", 15, LocalDate.of(2022, 5, 14));
		archivo2 = new Archivo("Juan", 15, LocalDate.of(2020, 5, 14));
		
		directorio.agregarElemento(archivo1);
		directorio.agregarElemento(archivo2);
		directorio.agregarElemento(directorio2);
		directorio.agregarElemento(directorio3);
	}

	/*
	@Test
	void testPrinter() {
		directorio.printStructure();
	}
	*/
	
	
	@Test
	void testUltimoModificado() {
		directorio = new Directorio("Carpeta", LocalDate.of(2020, 5, 14));
		archivo1 = new Archivo("Pepe", 15, LocalDate.of(2022, 6, 14));
		archivo2 = new Archivo("Juan", 15, LocalDate.of(2021, 5, 14));
		directorio.agregarElemento(archivo1);
		directorio.agregarElemento(archivo2);
		assertEquals(directorio.lastModified(), archivo1);
	}

	

	@Test
	void testElementoMasAntiguo() {
		directorio = new Directorio("Carpeta", LocalDate.of(2020, 5, 14));
		archivo1 = new Archivo("Pepe", 15, LocalDate.of(2022, 6, 14));
		archivo2 = new Archivo("Juan", 15, LocalDate.of(2021, 5, 14));
		directorio.agregarElemento(archivo1);
		directorio.agregarElemento(archivo2);
		assertEquals(directorio.oldestElement(), directorio);
	}
}
