package review;

public class BreakNContinue {

	public static void main(String[] args) {
		String str = "CyberTek Java";
		System.out.println(str.charAt(1) == 'a');

		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'J') || (str.charAt(i) == 'a')) {
				continue;
			}
			System.out.print(str.charAt(i) + "  ");

		}

	}

}
