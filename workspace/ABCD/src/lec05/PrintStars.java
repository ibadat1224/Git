package lec05;

public class PrintStars {

	public static void main(String[] args) {
		int n = 0;
		String stars = "*";

		while (n < 10) {
			System.out.println(stars);
			stars = stars + "*";
			n++;
		}
		n = 0;
		while (n < 5) {
			n++;
			System.out.println("*");

		}

	}

}
