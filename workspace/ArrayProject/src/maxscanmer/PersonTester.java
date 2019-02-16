package maxscanmer;

public class PersonTester {

	public static void main(String[] args) {
		// the process of creating an object is called instantiation
		// creating an object==creating an instance of the class
		Person p1 = new Person();
		p1.name = "Adam";
		p1.age = 20;
		p1.gender = 'M';
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.gender);

		p1.eat();
		p1.run();

		// p1.sleep();
		// p1.read();

		Person p2 = new Person();
		p2.name = "Ibadat";
		p2.age = 27;
		p2.gender = 'F';
		p2.eat();
		// System.out.println("This person has name < " + p2.name + ">" + "this
		// persons age <" + p2.age + ">"
		// + "her gender is<" + p2.gender + ">");

		int caloryfrom1mile = p2.run();

		// char initial=p2.getInitial();
		System.out.println("Persons name is<" + p2.name + ">and her initial is<" + p2.getInitial() + ">");

		// Scanner scanner =new Scanner(System.in);
		// String str= scanner.next();
		// int num+scanner.next();
		//
		System.out.println(p2.name + " was born in year " + p2.getBirthYear());

		p2.sayHelloTo("Ibadat");
		p2.goHome("Your home ", 10);
		String s = "MY Address";
		s = s.replace('Y', 'y');

		double result = p2.addNumbers(1.2, 2.2, 3.3);
		System.out.println("result is " + result);

	}

}
