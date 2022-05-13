package ar.edu.unq.po2.tp8_composite;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileSystemTestCase {

	Archivo archivo1;
	Archivo archivo2;
	Directorio directorio1;
	Directorio directorio2;
	List<FileSystem> contenido = new ArrayList<FileSystem>();
	List<FileSystem> vacio = new ArrayList<FileSystem>();
	
	@BeforeEach
	void setUp() throws Exception {
	
		archivo1 = new Archivo("Selfie", 10, LocalDate.of(2022,05,13));
		archivo2 = new Archivo("Selfie amigos", 20, LocalDate.of(2022,05,14));
		contenido.add(archivo1);
		contenido.add(archivo2);
		directorio1= new Directorio("Juegos",LocalDate.of(2022,05,10),contenido);
		directorio2= new Directorio("Videos",LocalDate.of(2022,05,12),vacio);
		
	}

	@Test
	void testPesoDeUnArchivo() {
		assertEquals(archivo1.totalSize(), 10);
	}
	
	@Test
	void testPesoDelDirectorioJuegos() {
		assertEquals(directorio1.totalSize(), 30);
	}
	
	@Test
	void testPesoDelDirectorioVideosVacio() {
		assertEquals(directorio2.totalSize(), 0);
	}
	
	@Test
	void testPrintStructure() {
		directorio1.printStructure();
	}
	
	@Test
	void testTamañoTotalDeUnaCarpetaConUnArchivoYOtraCarpetaQueIncluyeDosArchivos() {
		directorio2.agregarFile(directorio1);
		directorio2.agregarFile(archivo1);
		assertEquals(40, directorio2.totalSize());
	}
	
	@Test
	void testArchivoMasNuevo() {
		assertEquals(directorio1.lastModified(), archivo2);
	}
	
	@Test
	void testArchivoMasViejo() {
		assertEquals(directorio1.oldestElement(), directorio1);
	}
}
