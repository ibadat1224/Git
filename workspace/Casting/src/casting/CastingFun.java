package casting;

public class CastingFun {

	public static void main(String[] args) {
		Engeneer e1 = new Engeneer("Adam", 25, 100);

		Person p1 = e1;
		Object o1 = e1;

		Person p2 = (Person) new Engeneer("John", 25, 101);

		Object o2 = p1;
		Engeneer e2 = (Engeneer) o2;
		e2.design("computer");

		((Engeneer) o2).design("pencil");
		((Engeneer) o1).design("Phone");

		e1.getAge();

		Smarty s1 = new Engeneer("Halil", 26, 105);
		Engeneer e4 = (Engeneer) s1;

		Smarty s2 = e4;
		System.out.println(s1);
	}

}
