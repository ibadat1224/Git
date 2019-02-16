package may23;

public class ScrumTeamMember {

	public String teamName = "Cybertek";
	protected static int capacity = 5;
	String tickets = "Login story";
	private int realWorkingHours = 5;

	public void work() {
		System.out.println("Scrum team member: " + teamName + " - capacity : " + capacity + " - working on " + tickets);

		joinStandUpmeeting();

	}

	public void joinStandUpmeeting() {
		System.out.println("Scrum team member is attending meeting");
	}

}
