package overloading;

public class OverloadingRule {

	public static void main(String[] args) {

		addNumber(10, 12);

	}

	public static void addNumber(int i, int j) {
		System.out.println();
	}

	public static void addNumber(long i, long j) {

	}

	public static void addNumber(Integer i, Integer j) {

	}

	public static void addNumber(Long i, Long j) {

	}

}
