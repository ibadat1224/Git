package overriding;

public class LocalStudent extends Student {

	private int seatID;

	public LocalStudent() {
		super("Unknown", -1);

	}

	public LocalStudent(String name, int studentID, int seatID) {
		super(name, studentID);

		this.seatID = seatID;

	}

	public static void main(String[] args) {
		LocalStudent l1 = new LocalStudent();
		System.out.println(l1.getName());

		LocalStudent l2 = new LocalStudent("Jane ", 200, 301);
		System.out.println(l2.getName());
		System.out.println(l2.getStudentID());
		System.out.println(l2.seatID);

		l2.attendClass();
	}

	@Override
	public void attendClass() {
		System.out.println("Local Student: " + getName() + " attending class inclass with seat " + seatID + " seat");
	}

}
