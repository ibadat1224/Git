package students;

public class Fruit implements Edible {

	public static final int NUM = 15;

	public static void main(String[] args) {
		System.out.println(NUM);
		System.out.println(Edible.NUM);

		Fruit f = new Fruit();
		f.drink();
	}

	@Override
	public void eat() {

	}

	@Override
	public void drink() {
		System.out.println("My own implementation");
		// Edible.super.drink();
	}

	static void doSomething() {

	}
}
