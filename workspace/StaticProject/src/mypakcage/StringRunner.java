package mypakcage;

import java.util.ArrayList;

public class StringRunner {

	public static void main(String[] args) {
		MyStringToolBox m = new MyStringToolBox("ABC12DF43");
		int sum = m.calculateSum();
		System.out.println(sum);

		m.targetString = "ABC";
		System.out.println(m.calculateSum());

		ArrayList<Character> ls = m.getList();
		System.out.println(ls);

	}

}
