package polymorphism;

public class Action extends Movie {

	int dramaLevel;

	public Action(String name, double movieLength, int actionLevel) {
		super(name, movieLength);
		this.dramaLevel = actionLevel;

	}

	@Override
	void printMovieInfo() {
		System.out.println("Action movie name : " + "Length : " + movieLength + " actionLevel : " + dramaLevel);
	}

}
