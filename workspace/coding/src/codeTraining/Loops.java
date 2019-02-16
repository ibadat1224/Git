package codeTraining;

public class Loops {

	public static void main(String[] args) {
		// int apples = 1;
		// while (apples <= 10) {
		// System.out.println("Eating apples :)" + apples);
		// apples++;
		// }
		// System.out.println("No more apples :( ");

		// int number, count;
		// Scanner keyboard = new Scanner(System.in);
		// System.out.println("enter a number");
		// number = keyboard.nextInt();
		//
		// count = 1;
		// while (count <= 10) {
		// System.out.println(count + ",");
		// count++;

		// for (int n = 5; n <= 10; n++) {
		// System.out.print("*");

		String[] fruits = new String[3];
		fruits[0] = "apples";
		fruits[1] = "pears";
		fruits[2] = "oranges";
		for (int i = 0; i < 3; i++)
			System.out.println(fruits[i]);

	}
}
