package ar.edu.unq.po2.tp10.PalabrasOrdenadas;

import javax.swing.DefaultListModel;

@SuppressWarnings("serial")
public class ListaDePalabrasOrdenadasAdapter extends DefaultListModel<String>{
	private ListaDePalabrasOrdenadas listaOrdenada;

	
	public ListaDePalabrasOrdenadasAdapter(ListaDePalabrasOrdenadas listaOrdenada) {
		super();
		this.setListaOrdenada(listaOrdenada);
	}
	
	@Override
	public void addElement(String element) {
		listaOrdenada.agregarPalabra(element);
	}

	public void setListaOrdenada(ListaDePalabrasOrdenadas listaOrdenada) {
		this.listaOrdenada = listaOrdenada;
	}
	
	public ListaDePalabrasOrdenadas getListaOrdenada() {
		return listaOrdenada;
	}
	
	
}
