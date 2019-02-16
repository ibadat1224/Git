package booksmanager;

import java.util.ArrayList;
import java.util.List;

import books.AudioBook;
import books.Author;
import books.Book;
import books.PaperbackBook;

public class Main {

	public static void main(String[] args) {
		Book audibleBook = new AudioBook("Twisted Prey", "Thriller", new Author("John Sandford"), 28.0, 4, 689);

		System.out.println(audibleBook.toString());

		// print out length of --->Twisted Prey

		// Downcasting from Book reference to audioBook reference
		System.out.println(((AudioBook) audibleBook).getLength());

		// I want a list that can store any kind of book
		List<Book> bookList = new ArrayList<>();

		bookList.add(new PaperbackBook("Adult Camp", "Comedy", new Author("Persis Orts"), 54, 8, 39));
		bookList.add(new AudioBook("MR.Turner", "Drama", new Author("Garfield Duinkerk"), 45, 1, 14));

		Book[] books = new Book[10]; // Book is abstract , so we are creating
										// array of Books, we are not creating
										// Book Object

		for (Book book : bookList) {
			if (book instanceof PaperbackBook) {
				System.out.println("PeperbackBook");
			} else {
				System.out.println("AudioBook");
			}
			System.out.println(book.getClass().getSimpleName());
			System.out.println(book.getClass().getName());

			System.out.println(book.toString());

		}
		System.out.println(bookList.toString());

	}

}
