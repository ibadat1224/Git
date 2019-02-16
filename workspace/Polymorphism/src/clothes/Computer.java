package clothes;

public class Computer extends Electronic {

	int memorySize = 10;

	public static void main(String[] args) {
		Electronic e = new Computer();
		System.out.println(e.memorySize);
		e.doSomething();
		e.printMemorySize();
	}

	@Override
	void printMemorySize() {
		System.out.println(memorySize);
	}

	static void doSomething() {
		System.out.println("do Computer stuff");
	}

}

class Electronic {
	int memorySize = 100;

	static void doSomething() {
		System.out.println("do Electronic stuff");
	}

	void printMemorySize() {
		System.out.println("From Electronic" + memorySize);
	}
}
