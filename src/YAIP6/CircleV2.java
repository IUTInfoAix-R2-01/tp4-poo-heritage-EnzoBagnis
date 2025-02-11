package YAIP6;

public class CircleV2 implements GeometricObject{
	protected double radius;
	
	public CircleV2(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "CircleV2 [radius=" + radius + "]";
	}
	
	@Override
	public double getPerimeter() {
		return 2*Math.PI * radius;
	}
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}
