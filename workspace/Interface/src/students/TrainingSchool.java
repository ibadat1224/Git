package students;

public class TrainingSchool extends School {

	public TrainingSchool() {
		super();
	}

	public void useCampus() {
		System.out.println("Using Campus in TrainingSchool");
	}

	@Override
	void teach() {
		System.out.println("Teaching in Training school");

	}

	@Override
	void hostEvent() {
		System.out.println("Hosting event in Training school");

	}

	@Override
	Student getStudent() {
		System.out.println("Training School is returning Student");
		return new OnlineStudent();
	}

}
