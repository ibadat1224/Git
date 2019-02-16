package loop;

public class Patterns2 {

	public static void main(String[] args) {
		String s = "#";
		for (int i = 1; i <= 6; i++) {
			// add spaces
			for (int j = 1; j <= 6 - i; j++) {

				System.out.print("-");
			}
			System.out.println(s);
			s += "##";

			for (int i1 = 1; i1 <= 5; i1++) {

				for (int k = 1; k <= i1; k++) {
					System.out.print("-");
				}
				for (int k = 1; k <= (6 - i1) * 2 - 1; k++) {
					System.out.print("#");

				}
				System.out.println();
			}
		}
	}

}
