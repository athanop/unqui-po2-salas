package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto{

	
	public ProductoCooperativa(String nombre, Double precio) {
		super(nombre, precio);
	}

	public double getPrecio() {
		return (super.getPrecio()-this.descuentoIVA());
	}

	private double descuentoIVA() {
		return super.getPrecio()*10/100;
	}
	
}
