package mypakcage;

import java.util.ArrayList;

public class MyStringToolBox {

	String targetString;

	public MyStringToolBox() {
		System.out.println("no arg");
	}

	public MyStringToolBox(String targetString) {
		this.targetString = targetString;
	}

	public int calculateSum() {
		int sum = 0;
		for (int i = 0; i < targetString.length(); i++) {

			if (Character.isDigit(targetString.charAt(i))) {
				String s = String.valueOf(targetString.charAt(i));
				sum = sum + Integer.parseInt(s);

				// sum = sum + targetString.charAt(i);
				// System.out.println(targetString.charAt(i));
			}

		}

		return sum;
	}

	public ArrayList<Character> getList() {
		ArrayList<Character> lst = new ArrayList<>();

		for (int i = 0; i < targetString.length(); i++) {

			if (Character.isAlphabetic(targetString.charAt(i))) {

				lst.add(targetString.charAt(i));
			}
		}
		return lst;
	}

}
