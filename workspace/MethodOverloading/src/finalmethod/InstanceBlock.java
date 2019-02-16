package finalmethod;

public class InstanceBlock {

	public final int num;
	int num1;
	int num2;
	// static block
	static {
		System.out.println("static block");
	}
	// instance block
	// instance block will run before any constractor
	// instance block will run every time an object is created

	{
		num = 123;
		System.out.println("instance block");
	}

	// 2nd instance field
	{

		System.out.println("Instance block 2");

	}

	public static void main(String[] args) {
		System.out.println("Main started");
		InstanceBlock ib = new InstanceBlock();
		InstanceBlock ib1 = new InstanceBlock();
		InstanceBlock ib2 = new InstanceBlock(4, 6);
		System.out.println("Main ended");

	}

	public InstanceBlock() {
		System.out.println("no arg constractor 1");
	}

	public InstanceBlock(int i, int j) {
		System.out.println("2 arg constractor ");
		this.num1 = i;
		this.num2 = j;
	}

}
