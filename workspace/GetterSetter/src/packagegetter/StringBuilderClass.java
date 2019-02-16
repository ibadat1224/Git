package packagegetter;

public class StringBuilderClass {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.append("efg");

		sb.append("efg").append("hij").append("klm");
		System.out.println(sb.toString());
		System.out.println(sb);
	}

}
