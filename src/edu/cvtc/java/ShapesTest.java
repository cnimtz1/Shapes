/**
 * 
 */
package edu.cvtc.java;

/**
 * @author Chris Nimtz
 *
 */
//Class for testing of the shapes objects
public class ShapesTest {
	
	//Main Method
	public static void main(String[] args) {
		
		//Declaring Objects
		Cuboid Cube = new Cuboid();
		Cylinder Cylind = new Cylinder();
		Sphere Spheroid = new Sphere();
		
		//Cube parameters
		Cube.setDepth(10);
		Cube.setHeight(15);
		Cube.setWidth(12);
		
		//Cylind parameters
		Cylind.setHeight(15);
		Cylind.setRadius(5);
		
		//Speroid paramerters
		Spheroid.setRadius(10);
		
		//Create message boxes for each shape
		Cube.render(); //Expected SA = 900, Expected V = 1800
		Cylind.render();//Expected SA = ~628.32, Expected V = ~1178.1
		Spheroid.render();//Expected SA = ~1256.64, Expected V = ~4188.79
		
		
	}
	
	

}
