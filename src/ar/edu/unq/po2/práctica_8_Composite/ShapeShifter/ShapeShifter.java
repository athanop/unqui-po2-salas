package ar.edu.unq.po2.práctica_8_Composite.ShapeShifter;

import java.util.ArrayList;
import java.util.List;

public class ShapeShifter implements IShapeShifter{

	private List<IShapeShifter> shapeshifters;

	public List<IShapeShifter> getShapeshifters() {
		return shapeshifters;
	}
	
	public ShapeShifter() {
		super();
		this.shapeshifters = new ArrayList<IShapeShifter>();
	}

	public void addShapeShifter(IShapeShifter shape) {
		this.shapeshifters.add(shape);
	}
	
	public void removeShapeShifter(IShapeShifter shape) {
		this.shapeshifters.remove(shape);
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
		int prof = 1;
		for(IShapeShifter s:this.shapeshifters) {
			prof+=s.deepest();
		}
		return prof;
	}

	@Override
	public IShapeShifter flat() {
		ShapeShifter nuevoShape = new ShapeShifter();
		for(Integer i : this.values()){
			nuevoShape.addShapeShifter(new ShapeShifterLeaf(i));;
		}
		return nuevoShape;
	}

	@Override
	public List<Integer> values() {
		List<Integer> values = new ArrayList<Integer>();
		for(IShapeShifter shape:this.shapeshifters) {
			values.addAll(shape.values());
		}
		return values;
	}

	

}
