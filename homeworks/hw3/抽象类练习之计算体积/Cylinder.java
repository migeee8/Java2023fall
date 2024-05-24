package hw3;

public class Cylinder extends ObjectVolume{
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height){
		this.height = height;
		this.radius = radius;
	}
	@Override
	double getVolume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
}
