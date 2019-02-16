package students;

public interface Drinkable {

	default void drink() {
		System.out.println("This " + "the default way to drink for now");
	}

}
