package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;

@BeforeEach
public void setUp() throws Exception {
	//Se crea el contador
	counter = new Counter();
	//Se agregan los numeros. Un solo par y nueve impares
	counter.addNumber(1);
	counter.addNumber(3);
	counter.addNumber(5);
	counter.addNumber(7);
	counter.addNumber(9);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(1);
	counter.addNumber(4);
	}


//verifica la cantidad de pares
@Test
public void verificarCantidadDePares() {
// Getting the even occurrences
	int amount = counter.obtenerCantidadDePares();
	// I check the amount is the expected one
	assertEquals(amount, 1);
	}

//verifica la cantidad de impares

@Test
public void verificarCantidadDeImpares() {
// Getting the even occurrences
	int amount = counter.obtenerCantidadDeImpares();
	// I check the amount is the expected one
	assertEquals(amount, 9);
	}

//verifica la cantidad de multiplos
@Test
public void verificarCantidadDeMultiplos() {
// Getting the even occurrences
	int amount = counter.obtenerCantidadDeMultiplos(9);
	// I check the amount is the expected one
	assertEquals(amount, 1);
	}
}
