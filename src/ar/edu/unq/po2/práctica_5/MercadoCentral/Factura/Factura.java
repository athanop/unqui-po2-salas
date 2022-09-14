package ar.edu.unq.po2.práctica_5.MercadoCentral.Factura;

import ar.edu.unq.po2.práctica_5.MercadoCentral.Agencia;
import ar.edu.unq.po2.práctica_5.MercadoCentral.IElemento;

public abstract class Factura implements IElemento{

	Agencia agencia;
	
	public abstract void RegistrarPago();
	public abstract Double getPrecio();
	
}
