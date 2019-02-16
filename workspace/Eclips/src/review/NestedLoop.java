package review;

public class NestedLoop {

	public static void main(String[] args) {

		for (int j = 1; j < 4; j++) {
			System.out.println("outer loop iteration:" + j);
		}
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println();
	}

}
