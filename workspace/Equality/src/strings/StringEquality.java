package strings;

import java.util.ArrayList;

public class StringEquality {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;
		System.out.println(s1 == s2);

		String s3 = "Hello";
		System.out.println(s3 == s1);

		String s4 = new String("Hello");
		System.out.println(s1 == s4);

		System.out.println(s3.equals(s4));

		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().equals(sb2.toString()));

		StringEquality obj1 = new StringEquality();
		System.out.println(obj1);

		ArrayList<Integer> ls1 = new ArrayList<>();
		ls1.add(22);

		ArrayList<Integer> ls2 = new ArrayList<>();
		ls1.add(10);

		System.out.println(ls1.equals(ls2));

	}

	public String toString() {
		return "my own message";
	}
}
