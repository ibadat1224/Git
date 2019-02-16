package polymorphism;

public class Drama extends Movie implements DramaMaker {

	int dramaLevel;

	public Drama(String name, double movieLength, int dramaLevel) {
		super(name, movieLength);
		this.dramaLevel = dramaLevel;
	}

	@Override
	void printMovieInfo() {
		System.out.println("Action movie name : " + " Length : " + movieLength + " actionLevel : " + dramaLevel);

	}

}
