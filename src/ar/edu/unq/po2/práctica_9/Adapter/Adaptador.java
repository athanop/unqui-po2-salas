package ar.edu.unq.po2.práctica_9.Adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class Adaptador<E> implements Enumeration<E> {

	private Iterator<E> iterator;
	
	@Override
	public boolean hasMoreElements() {
		return this.iterator.hasNext();
	}

	@Override
	public E nextElement() {
		return this.iterator.next();
	}

}
