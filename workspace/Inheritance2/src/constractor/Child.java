package constractor;

public class Child extends Parent {
	int age;

	public Child() {
		System.out.println("Child constractor message");
	}

	public static void main(String[] args) {
		Child c = new Child();
	}
}
