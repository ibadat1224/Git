
public class Person {

	String name;
	Person brother;

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Adam";

		Person p2 = new Person();
		p2.name = "John";
		p1.brother = p2;

		p1 = null;
	}

}
