package constractor;

public class Student {
	public Student() {
		// this("No One");
		System.out.println("Messege from costractor");
	}

	public Student(String name) {
		this();
		System.out.println("name of student " + name);
	}
}