package reviewabstraction;

public class Circle extends Shape {

	double radius;

	public Circle() {
		super("Circle");
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		area = Math.PI * radius * radius;

	}
}
