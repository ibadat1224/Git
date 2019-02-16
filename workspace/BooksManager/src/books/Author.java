package books;

import java.util.List;

public class Author {

	private String name;
	private List<String> genre;

	// Constractor overloading

	public Author(String name) {
		super();
		this.name = name;

	}

	public Author(String name, List<String> genre) {

		this(name);
		this.genre = genre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getGenre() {
		return genre;
	}

	public void setGenre(List<String> genre) {
		this.genre = genre;
	}

	public String toString() {
		return name;
	}
}
