package overriding;

public class Student {

	private String name;
	private int studentID;

	public Student(String name, int studentID) {
		super();
		this.name = name;
		this.studentID = studentID;

	}

	public String getName() {
		return name;
	}

	public int getStudentID() {
		return studentID;

	}

	public void attendClass() {
		System.out.println("attending class...");
	}

}
