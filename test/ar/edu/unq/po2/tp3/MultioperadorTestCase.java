package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador.Multioperador;


public class MultioperadorTestCase {

	Multioperador multioperador = new Multioperador();
	
	ArrayList<Integer> array = new ArrayList<Integer>();
	
	@BeforeEach
	public void setUp() {
		array.add(10);
		array.add(5);
	}
	
	
	@Test
	public void sumatoria() {
		assertEquals(15, multioperador.sumatoria(array));
	}
	
	
	@Test
	public void restarTodo() {
		assertEquals(5, multioperador.restarArray(array));
	}
	
	@Test
	public void multiplicarTodo() {
		assertEquals(50, multioperador.multiplicarArray(array));
	}
}
