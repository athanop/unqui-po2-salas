package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CounterTestCase {
	private Counter counter;
	private ArrayList<Integer> arrayTest = new ArrayList<Integer>();

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

@BeforeEach
public void initialize() {
	arrayTest.add(1111); arrayTest.add(2222); arrayTest.add(24688); arrayTest.add(2468888); 
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



//Test del ejercicio 2 Desarmando numeros

@Test
public void contadorDeDigitos() {
	assertEquals(6, counter.cantidadDeDigitosDe(123456));
}


@Test
public void mayorCantidadDeParesEntreDosNumeros() {
	assertEquals(2234,counter.numerosConMasParesEntre(1112, 2234));
}

@Test
public void digitoSinPares() {
	Counter desarmar = new Counter();
	int sinPares = desarmar.numerosParesEn(1111);
	assertEquals(0,sinPares);
}


@Test
public void numeroConMasParesEnElArray() {
	assertEquals(2468888, counter.desarmarNumeros(arrayTest));
}


//Test del ejercicio 3 Múltiplos

@Test
public void multiplosEntreDosNumeros() {
	assertEquals(999, counter.multiploEntre(3, 9));
}


@Test
public void sonMultiplos() {
	assertTrue(counter.sonMultiplos(3, 9,999));
}


}
