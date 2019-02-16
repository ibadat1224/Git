package polymorphism;

public class MovieManager {

	public static void main(String[] args) {

		Movie m1 = new Action("Avengers", 2.30, 4);
		Movie m2 = new Drama("Titanic", 2.50, 10);
		Action m3 = new Action("Cailou", 0.3, 8);

		DramaMaker m4 = new Drama("Elmo the monster", 0.4, 23);

		displayMovieInfo(m1);
		displayMovieInfo(m2);
		displayMovieInfo(m3);

	}

	static void displayMovieInfo(Movie m) {
		m.printMovieInfo();
		System.out.println("first method");
	}

	static void displayMovieInfo(Action m) {
		m.printMovieInfo();
		System.out.println("second method");
	}

	static Movie getTitanicMovie() {

		Movie m = new Action("avatar", 2.34, 4);
		return m;
	}

	static DramaMaker getDramaMaker() {
		Drama m = new Drama("Viena", 0.3, 5);
		return m;
	}

}
