package overriding;

public class Computer {

	int ram = 15;

	public Computer() {

	}

	public void printComputerRam() {
		System.out.println(ram);
		// computeStatic();
	}

	static void computeStatic() {
		System.out.println("computing");
	}

	public void compute() {
		System.out.println("computing..");
	}

	public Object getAnyObject() {
		return " my object";
	}
}
