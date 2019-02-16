package reviewabstraction;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle("SuperCircle", 4);
		System.out.println(c.name);
		System.out.println(c.area);
		System.out.println(c.radius);

		c.calculateArea();
		System.out.println(c.name);
		System.out.println(c.area);
		System.out.println(c.radius);
	}

}
