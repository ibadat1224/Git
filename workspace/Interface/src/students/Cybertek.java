package students;

public class Cybertek extends TrainingSchool implements CanvasSystem {

	@Override
	void hostEvent() {
		System.out.println("Hosting an event in Cybertek");
	}

	public void hostHackathon() {
		System.out.println("Hosting Hackathon");
	}

	@Override
	public void useCanvas() {
		System.out.println("Using the Canvas system in Cybertek School");
	}

	@Override
	Student getStudent() {
		if (true) {
			return new OnlineStudent();

		} else {
			return new InclassStudent();
		}
	}
}
