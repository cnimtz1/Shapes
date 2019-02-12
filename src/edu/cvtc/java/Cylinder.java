package edu.cvtc.java;

import javax.swing.JOptionPane;

/**
 * @author Chris Nimtz
 *
 */

//Cylinder class that is a sub class of Shape
public class Cylinder extends Shape {

	//Attributes
	private float radius;
	private float height;
	
	//Constructor
	public Cylinder() {
		setRadius(0.0f);
		setHeight(0.0f);
	}

	//Get and Set Radius, accessors set to public
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}

	//Get and Set Height, accessors set to public
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	
	
	//Surface area override for cylinder, SA=2(pi)rh + 2(pi)r^2
	@Override
	public float surfaceArea() {
		if (height <= 0.0f || radius <= 0.0f) {//if a negative, set area to 0
			return 0;
		} else { 
			return 2*PI*radius*height + 2*PI*radius*radius;
		}
		
	}
	
	//Volume override for cylinder, V=(pi)hr^2
	@Override
	public float volume() {
		if (height <= 0.0f || radius <= 0.0f) {//if a negative, set area to 0
			return 0;
		} else { 
			return PI*height*radius*radius;
		}
		
	}
	
	//render() for Cylinder message box
	@Override
	protected void render() {
		//If check to generate error if values are negative or 0
		if (height <= 0.0f || radius <= 0.0f) {
			JOptionPane.showMessageDialog(null, 
					"Dimensions can not be 0 or negative", 
					"Geometry Error",
					JOptionPane.ERROR_MESSAGE);
		} else { //display values for message box
			JOptionPane.showMessageDialog(null,
					"Height is " + height + ", Radius is " + radius 
					+ ", Surface Area is " + surfaceArea() 
					+ " and the Volume is " + volume(),
					"Cylinder Stats",
					JOptionPane.PLAIN_MESSAGE);
		}
	}	
}
