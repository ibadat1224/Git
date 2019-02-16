package students;

public interface Edible {
	int NUM = 10;

	void eat();

	default void drink() {
		System.out.println("This " + "the default way to drink");
	}

	static int doSomething() {
		return 0;
	}

}
