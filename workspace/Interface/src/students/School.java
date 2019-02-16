package students;

public abstract class School {

	public String schoolType;
	private int schoolCount;

	public School() {
		super();
	}

	abstract void teach();

	abstract void hostEvent();

	abstract Student getStudent();
}