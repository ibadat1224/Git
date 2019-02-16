package reviewabstraction;

public abstract class Shape {

	String name;
	double area;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public Shape(String name, double area) {
		super();
		this.name = name;
		// this(name);
		this.area = area;
	}

	public abstract void calculateArea();

}
