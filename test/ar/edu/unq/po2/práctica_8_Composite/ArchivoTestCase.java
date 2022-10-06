package ar.edu.unq.po2.práctica_8_Composite;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_8_Composite.FileSystem.Archivo;

class ArchivoTestCase {

	Archivo archivo, archivo2;
	
	@BeforeEach
	void setUp() throws Exception {
	
		archivo = new Archivo("Pepe", 12, LocalDate.of(2022, 6, 17));
		archivo2 = new Archivo("Juan", 15, LocalDate.of(2023, 6, 17));
			
	}
	
	@Test
	void testPrintNombreDelArchivo() {
		archivo.printStructure();
	}

}