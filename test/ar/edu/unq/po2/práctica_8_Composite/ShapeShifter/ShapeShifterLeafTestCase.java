package ar.edu.unq.po2.práctica_8_Composite.ShapeShifter;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.CALLS_REAL_METHODS;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifterLeafTestCase {

	ShapeShifterLeaf shapeLeaf, shapeLeaf2;
	List<Integer> values;
	@BeforeEach
	void setUp() throws Exception {
		shapeLeaf = new ShapeShifterLeaf(1);
		shapeLeaf2 = new ShapeShifterLeaf(2);
		values = new ArrayList<Integer>();
	}

	@Test
	void testValuesShapeShifterLeafConValor1() {
		values.add(1);
		assertEquals(shapeLeaf.values(), values);
	}

	
	@Test
	void testShapeShifterLeafDeepest() {
		assertEquals(shapeLeaf.deepest(), 0);
	}
}
