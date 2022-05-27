package ar.edu.unq.po2.tp8_composite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter{

	Integer valor;
	
	public ShapeShifterLeaf(Integer i) {
		this.valor=i;
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
		List<Integer> valores = new ArrayList<Integer>();
		valores.add(this.getValor());
		return valores;
	}

	private Integer getValor() {
		return this.valor;
	}

}
