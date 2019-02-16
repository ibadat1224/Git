package constractor;

public class Parent {
	String name;

	public Parent() {
		System.out.println("Parent constractor message");
	}

	public Parent(String name) {
		this();
		this.name = name;
		System.out.println("One arg constractor from Parent");
	}

}
