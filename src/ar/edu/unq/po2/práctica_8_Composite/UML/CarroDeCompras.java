package ar.edu.unq.po2.práctica_8_Composite.UML;

import java.util.List;

public class CarroDeCompras {

	private List<Product> products;

	public List<Product> getElements() {
		return products;
	}

	public void setElements(List<Product> products) {
		this.products = products;
	}
	
	public int totalRounded() {
		return Math.round(total());
		
	}
	
	public float total() {
		float total = 0;
		for(Product p:this.getElements()) {
			total +=p.getPrice();
		}
		return total;
	}
	
}
