package abstraction;

public class LocalStudent extends Student {

	@Override
	public void attendClass() {
		System.out.println("attending in class");
	}

	public static void main(String[] args) {

		// NO OBJECT CAN BE CREATED FOR ABSTRACT CLASS
		// Student s = new Student(); --- DOESNOT COMPILE!!!!
	}

}
