package casting;

public class BadCasting {

	public static void main(String[] args) {

		Person p1 = new Person();
		Engeneer e1 = (Engeneer) p1;

//		Object o = new Object();
//		String s = (String) o;

		Person p2 = new Engeneer("Adam", 24, 345);
		Engeneer e2 = (Engeneer) p2;

	}

}
