package manager;

public class MentorAction {

	public static void main(String[] args) {

		int num1 = 5;
		increaseNumber(num1);
		System.out.println("value after method call " + num1);

		Mentor m1 = new Mentor(15);
		ChangeMentorID(m1);
		System.out.println("MentorID outside is " + m1.getId());
	}

	static void ChangeMentorID(Mentor m) {
		m.setID(20);
		System.out.println("Mentor ID inside is " + m.getId());
	}

	static void changeMentor(Mentor m) {
		m = new Mentor(10);
		System.out.println("Mentor ID inside is " + m.getId());
	}

	static void increaseNumber(int value) {
		value = value + 5;
		System.out.println("new value is value " + value);
	}

}
