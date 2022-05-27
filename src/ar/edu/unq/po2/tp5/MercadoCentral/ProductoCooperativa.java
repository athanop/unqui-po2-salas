package ar.edu.unq.po2.tp5.MercadoCentral;

public class ProductoCooperativa extends Producto{

	private double descuento = super.getPrecio()*10/100;
	
	public ProductoCooperativa(String nombre, Double precio) {
		super(nombre, precio);
	}

	public double getPrecio() {
		return (super.getPrecio()-this.descuento);
	}

	
	
}
