package ar.edu.unq.po2.tp10.Adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class Adaptador<E> implements Enumeration<E>{

	private Iterator<E> adapt;
	
	@Override
	public boolean hasMoreElements() {
		return this.adapt.hasNext();
	}

	@Override
	public E nextElement() {
		return this.adapt.next();
	}

}
