package may23;

public class Main {

	public static void main(String[] args) {
		QA qaTester = new QA();
		System.out.println(qaTester.teamName);
		System.out.println(qaTester.tickets);
		System.out.println(qaTester.capacity);

		ScrumTeamMember qaTester2 = new QA();
		System.out.println(qaTester2.teamName);
		System.out.println(qaTester2.tickets);
		System.out.println(qaTester2.capacity);

		qaTester.work();
		qaTester2.work();
		qaTester.joinStandUpmeeting();
		qaTester2.joinStandUpmeeting();
	}

}
