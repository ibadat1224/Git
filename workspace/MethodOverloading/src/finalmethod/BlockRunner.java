package finalmethod;

import static finalmethod.StaticBlockOrder.ORDER;

public class BlockRunner {

	public static void main(String[] args) {

		StaticBlockOrder s = new StaticBlockOrder();
		StaticBlockOrder s1 = new StaticBlockOrder();

		System.out.println(StaticBlockOrder.ORDER);
		System.out.println(ORDER);

		int result = (int) StaticBlockOrder.doubleTheNumber();
		System.out.println(result);
	}

}
