package warmup;

public class Teacher extends Person {

	int teacherID = 12345;

	public Teacher() {

	}

	public Teacher(String name, int age, int teacherID) {
		this.name = name;
		this.age = age;
		this.teacherID = teacherID;
	}

	public void teach(String subject) {
		System.out.println("Teachinge " + subject);
	}

	public static void main(String[] args) {
		Person p = new Person();

		Teacher t1 = new Teacher();
		System.out.println(t1.name);
		t1.eat();
		t1.teach("Java");

	}
}