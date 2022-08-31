package ar.edu.unq.po2.práctica_3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	Multioperador multi;
	
	@BeforeEach
	void setUp() throws Exception {
	
		List<Integer> numeros = Arrays.asList(2,4);
		multi = new Multioperador(numeros);
	}

	@Test
	void testSumarArray() {
		assertEquals(6, multi.sumar());
	}

	@Test
	void testRestarArray() {
		assertEquals(2, multi.restar());
	}
	
	@Test
	void testMultiplicarArray() {
		assertEquals(8, multi.multiplicar());
	}
	
}
