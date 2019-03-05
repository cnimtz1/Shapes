package edu.cvtc.java;

public class ShapeFactory {

	private Dialog dialog;
	
	@SuppressWarnings("unused")
	private void setDialog(Dialog dialog) {
		this.dialog = dialog;
	}
	
	@SuppressWarnings("unused")
	private Dialog getDialog() {
		return dialog;
	}
	
	public ShapeFactory(Dialog dialog) {
		this.dialog = dialog;
		dialog.show("Test message", "Test Title");
	}
	
	public Shape make(ShapeType type) {
		Shape shape;
		switch(type) {
		case Cylinder:
			shape = new Cylinder(this.dialog);
			return shape;
		case Cuboid:
			shape = new Cuboid(this.dialog);
			return shape;
		case Sphere:
			shape = new Sphere(this.dialog);
			return shape;
		default:
			throw new IllegalArgumentException("This Is not a valid type!");
			
		}
	}
}
