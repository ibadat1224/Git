package codeTraining;

public class Investment {

	public static void main(String[] args) {
		double startValue = 10000;
		double rate = 0.11;
		double length = 20; // years
		double currentValue = 0;

		for (int i = 1; i <= length; i++) {
			currentValue = startValue * Math.pow((1 + rate), i);
			System.out.println(i + ":" + currentValue);
		}

	}

}
