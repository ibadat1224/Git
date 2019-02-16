package casting;

public class Person {

	String name;
	int age;

	public Person() {

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name =  " + name + ", Age=  " + age + "]";
	}

	public static void main(String[] args) {

		Person p1 = new Person("Ibadat", 27);
		System.out.println(p1);
		System.out.println(p1.name);
		System.out.println(p1.age);

		System.out.println(new Person("Ibadat", 27));
		Object o1 = new Person("Meder", 25);
		System.out.println(o1.toString());

		System.out.println(p1.hashCode());

		Person p2 = (Person) o1;
		System.out.println(p2.age);
		System.out.println(p2.getAge());

	}
}
