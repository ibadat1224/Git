package todaysclass;

import java.util.Arrays;
import java.util.List;

public class Array2ArrayList {

	public static void main(String[] args) {
		String[] flowers = { "Roses", "Tulips", "Lilies", "Aloe", "Jasmin" };
		List<String> flowersList = Arrays.asList(flowers);

		String[] birds = { "Eagle", "Parrot", "Hawk", "Raven", "Cardinal", "Turkey" };

		List<String> birdsList = Arrays.asList(birds);

		System.out.println(flowersList);
		System.out.println(birdsList);

		List<Character> letters = Arrays.asList('A', 'B', 'G', 'P');

		for (Character ch : letters) {
			System.out.println(ch);
		}

	}

}
