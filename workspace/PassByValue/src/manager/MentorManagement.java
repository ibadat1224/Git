package manager;

public class MentorManagement {

	public static void main(String[] args) {

		// int num = 5;
		Mentor m1 = new Mentor("Adam", 100);
		Mentor m2 = new Mentor("Jake", 101);

		Mentor.school = "Cybertek";

		assignMentorByID(45);
		assignMentorByID(101);
		// MentorManagement.assignMentorByID(46);

		assignMentor(m1);
		assignMentor(m2);

	}

	public static void assignMentorByID(int ID) {

		System.out.println("assigning mentor id  " + ID);

	}

	public static void assignMentor(Mentor mentor) {

		System.out.println("mentor name " + mentor.getName() + "| mentor id: " + mentor.getId());

	}

}
