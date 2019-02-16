package grades;

public class Grades {

	public static void main(String[] args) {
		double score = 50;
		String grade = "A";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else if (score > 60) {
			grade = "C-";

		}
		System.out.println("Grade:" + grade);
	}

}
