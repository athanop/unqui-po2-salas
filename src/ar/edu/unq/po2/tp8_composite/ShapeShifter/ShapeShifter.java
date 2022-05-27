package ar.edu.unq.po2.tp8_composite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifter implements IShapeShifter{

	private List<IShapeShifter> shapeShifters = new ArrayList<IShapeShifter>();
	
	public void addShapeShifter(IShapeShifter x) {
		this.shapeShifters.add(x);
	}

	
	@Override
	public IShapeShifter compose(IShapeShifter shapeShifter) {
		ShapeShifter shapeNuevo = new ShapeShifter();
		shapeNuevo.addShapeShifter(shapeShifter);
		shapeNuevo.addShapeShifter(this);
		return shapeNuevo;
	}

	
	
	@Override
	public int deepest() {
		int total=1;
		int max=0;
		for(IShapeShifter s:this.shapeShifters) {
			max = Math.max(max, s.deepest());
		}
		return total+max;
	}
	
	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		for(IShapeShifter shape:this.shapeShifters) {
			values.addAll(shape.values());
		}
		return values;
	}

	@Override
	public IShapeShifter flat() {
		ShapeShifter nuevoShape = new ShapeShifter();
		for(Integer i : this.values()) {
			nuevoShape.addShapeShifter(new ShapeShifterLeaf(i));
		}
		return nuevoShape;
	}
	

}
