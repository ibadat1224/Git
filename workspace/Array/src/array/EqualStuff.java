package array;

public class EqualStuff {

	public static void main(String[] args) {

		// pointing both same object
		String one = "a";
		String two = "a";

		// work one way with string

		System.out.println(one == two);
		// two different object
		String a = new String("a");
		String b = new String("a");
		System.out.println(a == b);

		Bags mybag = new Bags();
		Bags your = new Bags();
		System.out.println(mybag == your);
		mybag = your;
		System.out.println(mybag == your);
		System.out.println(mybag.equals(your));
		mybag.toString();
		mybag.hashCode();
	}

}
