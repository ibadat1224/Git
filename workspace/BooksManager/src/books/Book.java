package books;

public abstract class Book {
	// Encapsulation
	private String title;
	private String genre;
	// has a relation:Book HAS AN AUTHOR
	private Author author;
	private double price;

	public Book(String title, String genre, Author author, double price) {
		super();
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override // overriding from Object class
	public String toString() {
		return " title=" + title + ", genre=" + genre + ", author=" + author + ", price=" + price;
	}

}
