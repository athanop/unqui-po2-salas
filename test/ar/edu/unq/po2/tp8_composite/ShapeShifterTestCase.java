package ar.edu.unq.po2.tp8_composite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ShapeShifterTestCase {

	ShapeShifter shape1;
	ShapeShifter shape2;
	ShapeShifterLeaf hoja1;
	ShapeShifterLeaf hoja2;
	
	
	@BeforeEach
	void setUp() throws Exception {
	
		shape1 = new ShapeShifter();
		shape2 = new ShapeShifter();
		hoja1 = new ShapeShifterLeaf(1);
		hoja2 = new ShapeShifterLeaf(2);
		
	
	}

	@Test
	void testHoja3ComposeHoja4() {
		
		assertTrue(hoja1.compose(hoja2).values().contains(1));
		assertTrue(hoja1.compose(hoja2).values().contains(2));
		assertTrue(hoja1.compose(hoja2).values().size()==2);
		
	}
	
	@Test
	void testShape1ComposeHoja3() {
		shape1.addShapeShifter(hoja2);
		assertTrue(shape1.compose(hoja2).values().contains(2));
		
	}
	
	@Test
	void testDeepest() {
	
		shape1.addShapeShifter(hoja1);
		assertTrue(hoja1.deepest()==0);
		assertTrue(shape1.deepest()==1);
		
	}
	
	

}
