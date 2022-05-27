package ar.edu.unq.po2.tp8_composite.ShapeShifter;

import java.util.List;

public interface IShapeShifter{
	
	public IShapeShifter compose(IShapeShifter shapeShifter);
	public int deepest();
	public IShapeShifter flat();
	public List<Integer> values();
	
}