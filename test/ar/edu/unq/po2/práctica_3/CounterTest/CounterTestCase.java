package ar.edu.unq.po2.práctica_3.CounterTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_3.Counter.Counter;

public class CounterTestCase {
	
		Counter counter;
		ArrayList<Integer> arrayTest = new ArrayList<Integer>();
		/**
		* Crea un escenario de test básico, que consiste en un contador
		* con 10 enteros
		*
		* @throws Exception
		*/
		
		
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
		
		arrayTest.add(1111); arrayTest.add(2222); arrayTest.add(24688); arrayTest.add(2468888); 
		}
		
		
		@Test
		public void testLaCantidadDeParesEsUno() {
			int amount = counter.pares();
			assertEquals(amount, 1);
		}
		
		@Test
		public void testLaCantidadDeImparesEsNueve() {
			int amount = counter.impares();
			assertEquals(amount, 9);
		}
		
		@Test
		public void testLaCantidadDeMultiplos() {
			int amount = counter.esMultiplo(2);
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