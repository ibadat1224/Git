import videos.Movie;

public class GarbageCollection {

	public static void main(String[] args) {

		int i = 10;
		Movie m1 = new Movie("Jumanji", 210);
		m1 = new Movie("Cargo", 123);
		// m1 = null;
		// m1.getName();

		Movie m2 = new Movie("Lord of the rings", 21);
		m2 = m1;

	}

}
