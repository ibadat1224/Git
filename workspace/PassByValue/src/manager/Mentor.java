package manager;

public class Mentor {

	public static void main(String[] args) {

	}

	public static String school; /// static filed/ variable
	private String name; // instance field/ variable
	private int id; // instance field/ variable

	public Mentor(int id) {
		this.id = id;
	}

	public Mentor(String name, int id) { // method parameter
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

}