package supermercado;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	

	public Producto(String nombreProducto, Double precioProducto) {
		this.setNombre(nombreProducto);
		this.setPrecio(precioProducto);
	}
	
	public Producto(String nombreProducto, Double precioProducto, Boolean esCuidado) {
		this(nombreProducto, precioProducto);
		this.esPrecioCuidado = esCuidado;
		
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public Double getPrecio() {
		return precio;
	}

	public Boolean getEsPrecioCuidado() {
		return esPrecioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public void aumentarPrecio(double aumento) {
		this.setPrecio(this.getPrecio()+aumento);
	}

}
