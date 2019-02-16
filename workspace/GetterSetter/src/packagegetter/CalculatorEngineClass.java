package packagegetter;

public class CalculatorEngineClass {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;

		System.out.println("Working with number : " + num1 + "," + num2);

		MathEquation me1 = new MathEquation('a', num1, num2);
		MathEquation me2 = new MathEquation('s', num1, num2);
		MathEquation me3 = new MathEquation('m', num1, num2);
		MathEquation me4 = new MathEquation('d', num1, num2);
		MathEquation me5 = new MathEquation('z', num1, num2);

		MathEquation[] equationArr = { me1, me2, me3, me4, me5 };
		for (MathEquation each : equationArr) {
			each.execute();
			System.out.println("The opCode is : " + each.getOpCode() + "| Result is : " + each.getResult());

			me5.setOpCode('s');
			me5.execute();
			System.out.println("result is :" + me5.getResult());

		}
	}
}
