package overriding;

public class OnlineStudent extends Student {

	private int webinarID;

	public OnlineStudent() {
		super("Unknown", -1);

	}

	public OnlineStudent(String name, int studentID, int webinarID) {
		super(name, studentID);

		this.webinarID = webinarID;

	}

	public static void main(String[] args) {
		OnlineStudent o1 = new OnlineStudent();
		System.out.println(o1.getName());

		OnlineStudent o2 = new OnlineStudent("Adam ", 100, 201);
		System.out.println(o2.getName());
		System.out.println(o2.getStudentID());
		System.out.println(o2.webinarID);

		o2.attendClass();
	}

	@Override
	public void attendClass() {
		System.out.println(
				"Online Student: " + getName() + " attending class online with webinarID " + webinarID + " webinar");
	}

}
