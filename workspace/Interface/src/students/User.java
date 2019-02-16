package students;

import java.util.ArrayList;
import java.util.List;

public class User {

	public static void main(String[] args) {
		// TrainingSchool t = new TrainingSchool();
		// t.hostEvent();
		//
		// School s = t;
		// if (t instanceof Cybertek) {
		// Cybertek c = (Cybertek) t;
		// c.useCanvas();
		// }
		// System.out.println("\n\n End of the programm");

		List<Student> cybertekStudents = new ArrayList<Student>();

		InclassStudent inS = new InclassStudent();
		OnlineStudent oS = new OnlineStudent();

		cybertekStudents.add(inS);
		cybertekStudents.add(oS);
		//
		// Student s = cybertekStudents.get(0);
		// Student s1 = cybertekStudents.get(1);
		for (Student s : cybertekStudents) {
			s.study();
		}

		// s.study();
		// s1.study();
	}
}
