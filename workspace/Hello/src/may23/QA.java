package may23;

public class QA extends ScrumTeamMember {

	protected static int capacity = 10;
	String tickets = "Logout story";

	@Override
	public void work() {
		System.out.println("QA : " + teamName + " - capacity : " + capacity + " - working on " + tickets);
	}

	@Override
	public void joinStandUpmeeting() {
		System.out.println("QA member is attending meeting");
	}

}
