package ar.edu.unq.po2.práctica_5.MercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.práctica_5.MercadoCentral.Factura.Servicio;
import ar.edu.unq.po2.práctica_5.MercadoCentral.Producto.Producto;

class CajaTestCase {

	Caja caja;
	Cliente cliente;
	IElemento yerba, agua, coca, servicio, impuesto;
	
	@BeforeEach
	void setUp() throws Exception {
		
		
		
		
		caja = new Caja();
		cliente = new Cliente();
		yerba = new Producto("Yerba", 20d);
		agua = new Producto("Agua", 10d);
		coca = new Producto("Coca", 15d);
		servicio = new Servicio(10d, 10, LocalDate.of(2022, 5, 5));
		
		
		
	}

	@Test
	void testLaCajaConoceSuStockDeAgua() {
		Map<IElemento, Integer> stockDeAgua = new HashMap<IElemento, Integer>();
		stockDeAgua.put(agua, 5);
		caja.setStock(stockDeAgua);
		
		assertEquals(5, caja.getStock());
	}
	
	@Test
	void testCajaRegistraLosProductosDeUnClienteYDisminuyeSuStock() {
		Map<IElemento, Integer> stockDelMercado = new HashMap<IElemento, Integer>();

		stockDelMercado.put(agua, 5);
		stockDelMercado.put(coca, 10);
		stockDelMercado.put(yerba, 5);
		caja.setStock(stockDelMercado);
		cliente.agregarProducto(agua);
		cliente.agregarProducto(coca);
		cliente.agregarProducto(yerba);
		
		caja.registrarPago(cliente);
		
		assertEquals(17, caja.getStock());
	}
	
	@Test
	void testLaCajaCobraAUnClienteConUnServicio() {
		Map<IElemento, Integer> stock = new HashMap<IElemento, Integer>();
		stock.put(agua, 5);
		stock.put(servicio, 100);
		caja.setStock(stock);
		
		cliente.agregarProducto(agua);
		cliente.agregarProducto(servicio);
		
		caja.registrarPago(cliente);
		
		assertEquals(caja.getMontoAPagar(), 110d);
	}

}