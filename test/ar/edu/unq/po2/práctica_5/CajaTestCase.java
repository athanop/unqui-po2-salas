package ar.edu.unq.po2.práctica_5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.práctica_5.MercadoCentral.Caja;
import ar.edu.unq.po2.práctica_5.MercadoCentral.Cliente;
import ar.edu.unq.po2.práctica_5.MercadoCentral.Producto;

class CajaTestCase {

	Caja caja;
	Cliente cliente;
	Producto yerba, agua, coca;
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		
		
		caja = new Caja();
		cliente = new Cliente();
		yerba = new Producto("Yerba", 20d);
		agua = new Producto("Agua", 10d);
		coca = new Producto("Coca", 15d);
		
		
		
		
	}

	@Test
	void testLaCajaConoceSuStockDeAgua() {
		Map<Producto, Integer> stockDeAgua = new HashMap<Producto, Integer>();
		stockDeAgua.put(agua, 5);
		caja.setStock(stockDeAgua);
		
		assertEquals(5, caja.getStock());
	}
	
	@Test
	void testCajaRegistraLosProductosDeUnClienteYDisminuyeSuStock() {
		Map<Producto, Integer> stockDelMercado = new HashMap<Producto, Integer>();

		stockDelMercado.put(agua, 5);
		stockDelMercado.put(coca, 10);
		stockDelMercado.put(yerba, 5);
		caja.setStock(stockDelMercado);
		
		cliente.agregarProducto(agua);
		cliente.agregarProducto(coca);
		cliente.agregarProducto(yerba);
		
		caja.registrarProducto(cliente);
		
		assertEquals(17, caja.getStock());
	}

}
