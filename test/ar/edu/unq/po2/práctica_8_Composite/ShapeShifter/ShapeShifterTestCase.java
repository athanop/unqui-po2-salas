package ar.edu.unq.po2.práctica_8_Composite.ShapeShifter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifterTestCase {

	
	IShapeShifter shape, shape2, shape3;
	ShapeShifterLeaf shapeLeafa,shapeLeafb;
	
	@BeforeEach
	void setUp() throws Exception {
		shape = new ShapeShifter();
		shape2 = new ShapeShifter();
		shape3 = new ShapeShifter();
		shapeLeafa = mock(ShapeShifterLeaf.class);
		shapeLeafb = mock(ShapeShifterLeaf.class);
		when(shapeLeafa.getValor()).thenReturn(1);
		when(shapeLeafb.getValor()).thenReturn(2);
		
		
	}

	@Test	
	void testShapeShifterDeepestConProfundidad1() {
		shape.compose(shapeLeafa);
		assertEquals(shape.deepest(), 1);
	}
	
	@Test	
	void testShapeShifterDeepestConProfundidad3() {
		shape.compose(shape3);
		shape2=shape3.compose(shape);
		assertEquals(shape2.deepest(), 3);
	}
	
	
	@Test	
	void testShapeShifterValues() {
		List<Integer> value = new ArrayList<Integer>();
		value.add(1);
		when(shapeLeafa.values()).thenReturn(value);
		assertEquals(shapeLeafa.values(), value);
	}
}
