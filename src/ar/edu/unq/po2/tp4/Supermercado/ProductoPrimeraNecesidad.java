package ar.edu.unq.po2.tp4.Supermercado;

public class ProductoPrimeraNecesidad extends Producto{
	
	
	private double descuento;


	public ProductoPrimeraNecesidad(String nombreProducto, Double precioProducto, Boolean esCuidado, Double conDescuento) {
		super(nombreProducto, precioProducto, esCuidado);
		this.setDescuento(conDescuento);
	
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public Double getPrecio() {
		return super.getPrecio()*this.getDescuento();
	}
	
	
}
