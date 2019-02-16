package overriding;

public class Mac extends Computer {
	// int ram; inherited;
	// int ram = 10;
	double ram = 10;

	// public void printRam(){
	// System.out.println(this.ram);
	// System.out.println(super.ram);
	// }

	public void printComputerRam() {
		System.out.println(ram);
	}

	@Override
	public Integer getAnyObject() {
		compute();
		this.compute();
		super.compute();

		return 4;
	}

	public static void main(String[] args) {

		Mac m = new Mac();
		// m.compute();
		// System.out.println(m.ram);
		// m.printRam();
		m.printComputerRam();
		Computer.computeStatic();
		Mac.computeStatic();
	}

	@Override
	public void compute() {
		System.out.println("computing with Mac");
	}
}
