package tracker;

/// if you have 2 classes with same name in 2 different packages
///

import java.awt.Rectangle;
import java.util.Scanner;

import audio.Song;
import audio.popsong.PopSong;
import videos.Movie;

public class Printer {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle((int) 12.1, 22);
		Song song = new Song("Hello", "Adele");
		Movie movie = new Movie("Jumanji", 210);
		PopSong ps = new PopSong();
		Scanner scan = new Scanner(System.in);

		printShapes(rec);
	}

	public static void printShapes(Rectangle re) {
		System.out.println(re.getHeight() + " " + re.getWidth());
	}

}
