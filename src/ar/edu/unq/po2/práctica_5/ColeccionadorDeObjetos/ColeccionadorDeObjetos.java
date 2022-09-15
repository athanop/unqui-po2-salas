package ar.edu.unq.po2.práctica_5.ColeccionadorDeObjetos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ColeccionadorDeObjetos {

	public Object getFirstFrom(List collection) {
		return collection.get(0);
	}
	
	public void addLast(Object element,List collection) {
		collection.add(element);
	}
	
	public Collection getSubCollection(ArrayList collection, int from, int to) {
		return collection.subList(from,to);
	}
	
	public Boolean containsElement(LinkedList collection, Object element) {
		return collection.contains(element);
	}
	
	/*Collection es una interface, la cual extiende de Iterable y por lo cual no se puede instanciar(el metodo getfirstfrom y getSubCollection no se pueden utilizar).
	 *List extiende de Collection, lo que le permite utilizar sus métodos y también propios(en este caso se pueden usar los 4 metodos definidos arriba).
	 *ArrayList es una clase que implementa List, por lo cual es posible instanciarla, lo mismo sucede para LinkedList.
	*/
	
	
	
}
