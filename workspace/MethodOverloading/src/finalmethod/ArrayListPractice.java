package finalmethod;

import java.util.ArrayList;

public class ArrayListPractice {

	public static ArrayList<String> lst;

	static {

		lst = new ArrayList<>();
		lst.add("Apple");
		lst.add("Orange");
		lst.add("banana");

	}

	public static void main(String[] args) {

		System.out.println(lst);

	}

}
