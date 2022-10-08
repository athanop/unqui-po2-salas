package ar.edu.unq.po2.práctica_8_Composite.ShapeShifter;

import java.util.List;

public interface IShapeShifter {
	
	public IShapeShifter compose(IShapeShifter shapeShifter);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
	
}

