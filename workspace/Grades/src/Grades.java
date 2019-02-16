
public class Grades {

	public static void main(String[] args) {
		double score = 40;
		if (score >= 60) {
			if (score >= 90) {
				System.out.println("A+");
			} else { // 60--89
				System.out.println("B+");
				System.out.println("still good");

			}
		} else {
			if (score >= 50) {
				System.out.println("D");
			} else {
				System.out.println("F");
				System.out.println("please work harder and get D");

			}
		}
	}
}
