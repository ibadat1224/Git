package array;

public class CheckCharacterInsideStr {

	public static void main(String[] args) {
		String str = "Cybertek";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'r') {
				System.out.println("Letter is found at index :" + i);
				break;
			}
			System.out.println(str.indexOf("r"));
		}

	}

}
