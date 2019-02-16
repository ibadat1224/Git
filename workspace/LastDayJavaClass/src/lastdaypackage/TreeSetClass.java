package lastdaypackage;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {

		// Comparator<Student> idCom = Comparator.comparing(w ->
		// w.getId());//LAMBDA
		Comparator<Student> idCom = new IdComparator();

		Comparator<Student> nameCom = new ReverseNameComparator();
		Comparator<Student> bothCom = idCom.thenComparing(nameCom);
		TreeSet<Student> stuTree = new TreeSet<>(bothCom);

		stuTree.add(new Student(22, "Kate"));
		stuTree.add(new Student(26, "Bob"));
		stuTree.add(new Student(26, "Dob"));
		stuTree.add(new Student(26, "Kop"));
		stuTree.add(new Student(45, "Gaga"));
		stuTree.add(new Student(54, "Dan"));
		stuTree.add(new Student(32, "Miki"));
		stuTree.add(new Student(45, "Tim"));
		System.out.println(stuTree);
	}

}