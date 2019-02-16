package packagegetter;

public class StudentOnline {

	private String name;
	private int webinarId;

	public StudentOnline(String name, int webinarId) {
		this.name = name;
		this.webinarId = webinarId;
	}

	public String toString() {
		return name + webinarId;

	}

}
