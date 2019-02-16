package stringbuilder;

public class WarmUp {

	public static void main(String[] args) {

		String word = "ABCDJIH24A53KD23BCHH451HJ";
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'C') {
				sb.append(word.charAt(i));

			}
		}
		String result = sb.toString();
		System.out.println();
		sb.replace(4, 7, "ZZZ");
		// whenever an object is printed out directly inside println
		// compiler will add.to.String() method call implicity
		// for example;
		System.out.println(sb);
	}

}
