package packagegetter;

public class Apple {

	public Apple() {
		System.out.println("apple no arg");

	}

	public Apple(String name) {
		this();
		// this.name=name;
	}

	public Apple(String name, int size) {
		this(name);
	}

	public void slice() {
		System.out.println("slicing..");

		prepareSecretSliceMenu();
		cutItintoSEcretShape();

	}

	private void cutItintoSEcretShape() {
		System.out.println("preparing the secret");
	}

	private void prepareSecretSliceMenu() {
		System.out.println("cutting the secret");

	}

	public static void main(String[] args) {

		Apple a = new Apple();
		a.slice();
	}
}
