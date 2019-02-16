package wrapper;

public class WarmUp {

	public static void main(String[] args) {
		String str = "AZVFTDDTDD";
		StringBuilder sb = new StringBuilder(str);
		sb.deleteCharAt(5);
		System.out.println(sb);

		sb.deleteCharAt(8);
		System.out.println(sb);

		sb.replace(5, 6, "K");
		System.out.println(sb);

		sb.insert(3, "iktory");
		System.out.println(sb);

		sb.charAt(4);
		System.out.println(sb.charAt(4));

	}

}
