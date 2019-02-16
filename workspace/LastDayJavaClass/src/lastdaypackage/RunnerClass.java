package lastdaypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RunnerClass {
	public static void main(String[] args) {

		List<Student> people = new ArrayList<>();
		people.add(new Student(1, "Adam"));
		people.add(new Student(2, "Jake"));
		people.add(new Student(5, "Kim"));
		people.add(new Student(4, "Kiki"));
		people.add(new Student(2, "Aidi"));

		// Comparator<Student> idCom = new IdComparator();
		//
		// Collections.sort(people, idCom);
		// System.out.println(people);
		//
		// Comparator<Student> stRev = new ReverseNameComparator();
		// Collections.sort(people, stRev);
		//
		// System.out.println(people);
		//
		// Comparator<Student> bothCom = idCom.thenComparing(stRev);
		// Collections.sort(people, bothCom);
		// System.out.println(people);

		Comparator<Student> lCom = Comparator.comparing(s -> s.getId());
		Comparator<Student> nCom = Comparator.comparing(s -> s.getId());
		Collections.sort(people, nCom);
		System.out.println(people);

	}
}
