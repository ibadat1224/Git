package lec06;

public class NestedLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {
				System.out.println(i * 9 + j + "\thello");
			}
			System.out.println();
		}
	}

}
