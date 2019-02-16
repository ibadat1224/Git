package overloading;

public class FinalMethodParameter {

	public static void main(String[] args) {
		add(3);
		String s = "ZZZ";
		print("ZZZZ");
		StringBuilder sb1 = new StringBuilder("aaa");
		print(sb1);
		print(new StringBuilder("aaa"));
	}

	public static void add(final int num) {
		System.out.println(num + 5);
	}

	public static void print(final String s) {

		// s = "abc";
		System.out.println(s);
	}

	public static void print(final StringBuilder s) {

		s.append("bbb");
		System.out.println(s);
	}

}
