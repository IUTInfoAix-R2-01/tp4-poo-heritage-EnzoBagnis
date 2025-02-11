package YAIP5;


public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder(Circle base, double height) {
	    if (base == null) {
	        throw new IllegalArgumentException("La base du cylindre ne peut pas être null.");
	    }
	    this.base = base;  // Assigner correctement l'objet passé en paramètre
	    this.height = height;
	}


	public Circle getBase() {
		return base;
	}

	public void setBase(Circle base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Cylinder [base=" + base + ", height=" + height + ", toString()=" + super.toString() + "]";
	}
	
	
}
