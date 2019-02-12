package edu.cvtc.java;

import javax.swing.JOptionPane;

/**
 * @author Chris Nimtz
 *
 */

//Sphere class that is a sub class of Shape
public class Sphere extends Shape{
	
	//Attributes
	private float radius;
	
	//Constructor
	public Sphere() {
		setRadius(0.0f);
	}

	//Get and Set Radius, accessors set to public
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	//Surface area override for sphere, SA=4*PI*r^2
	@Override
	public float surfaceArea() {
		if (radius <= 0.0f) {//if a negative, set area to 0
			return 0;
		} else { 
			return 4*PI*radius*radius;
		}
		
	}
	
	//Volume override for sphere, V=(4/3)*PI*r^3
	@Override
	public float volume() {
		if (radius <= 0.0f) {//if a negative, set area to 0
			return 0;
		} else { 
			return (float) (4.0 / 3.0)*(PI*(radius*radius*radius));
		}
		
	}
	
	//render() for Sphere message box
	@Override
	protected void render() {
		//If check to generate error if values are negative or 0
		if (radius <= 0.0f) {
			JOptionPane.showMessageDialog(null, 
					"Dimensions can not be 0 or negative", 
					"Geometry Error",
					JOptionPane.ERROR_MESSAGE);
		} else { //display values for message box
			JOptionPane.showMessageDialog(null,
					"Radius is " + radius 
					+ ", Surface Area is " + surfaceArea() 
					+ " and the Volume is " + volume(),
					"Sphere Stats",
					JOptionPane.PLAIN_MESSAGE);
		}
	}	
			

}
