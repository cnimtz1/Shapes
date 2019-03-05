package test.java;

import edu.cvtc.java.ShapeFactory;
import edu.cvtc.java.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShapeFactoryTest {

	MessageBoxSub MessageSub = new MessageBoxSub();
	ShapeFactory factory = new ShapeFactory(MessageSub);
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCube() {
		ShapeType cube = ShapeType.Cuboid;
		factory.make(cube);
	}
	
	@Test
	public void testSphere() {
		ShapeType sphere = ShapeType.Sphere;
		factory.make(sphere);
	}
	
	@Test
	public void testCylinder() {
		ShapeType cylind = ShapeType.Cylinder;
		factory.make(cylind);
	}
	
	@Test(expected = Error.class) //Trys to create invalid Shape Type
	public void testInvalidType() {
		ShapeType invalid = ShapeType.Invalid;
		factory.make(invalid);
	}

}
