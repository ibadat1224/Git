package casting;

public class InstanceOfPerson {

	public static void main(String[] args) {

		Object o = new Person();
		Person p;
		if (o instanceof Person) {
			p = (Person) o;
			System.out.println("cast successfull");
		} else {
			System.out.println("can not cast");
		}

		Object o2 = new Object();
		Person p1;
		if (o instanceof Person) {
			p1 = (Person) o;
			System.out.println("cast successfull");
		} else {
			System.out.println("can not Successfull");
		}

		boolean b1 = o instanceof Person;
		boolean b2 = o instanceof Object;
		boolean b3 = o instanceof Engeneer;
		boolean b4 = o instanceof Smarty;
		boolean b5 = o instanceof Duck;

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	}

}
