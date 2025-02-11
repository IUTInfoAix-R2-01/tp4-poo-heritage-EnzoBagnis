package YAIP6;

public class ResizableCircle extends CircleV2 implements Resizable{
	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public String toString() {
		return "ResizableCircle [radius=" + radius + ", toString()=" + super.toString() + "]";
	}
	
	public void resize(int percent) {
		radius *= percent/100.0;
	}
	
	
}
