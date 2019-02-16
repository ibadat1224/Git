package newclass;

public class Computer {

	protected double storage;
	protected String ramType;

	public Computer() {
		System.out.println("no arg constractor");
	}

	public Computer(double storage, String ramType) {
		this.storage = storage;
		this.ramType = ramType;
	}

	protected void compute() {
		System.out.println("computing...");
	}

	void display() {
		System.out.println("computerInfo" + storage + ramType);
	}

}