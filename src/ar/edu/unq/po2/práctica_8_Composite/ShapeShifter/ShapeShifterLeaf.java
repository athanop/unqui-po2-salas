package ar.edu.unq.po2.práctica_8_Composite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter{

	Integer valor;
	
	public Integer getValor() {
		return valor;
	}

	
	public ShapeShifterLeaf(Integer valor) {
		super();
		this.valor = valor;
	}

	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		ShapeShifter nuevoShape = new ShapeShifter();
		nuevoShape.addShapeShifter(this);
		nuevoShape.addShapeShifter(shapeShifter);
		return nuevoShape;
	}

	@Override
	public int deepest() {
		return 0;
	}

	@Override
	public IShapeShifter flat() {
		return this;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		values.add(this.getValor());
		return values;
	}



}
