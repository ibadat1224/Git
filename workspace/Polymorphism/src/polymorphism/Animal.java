package polymorphism;

public class Animal implements Mammal {

	@Override
	public void eat() {
		System.out.println("Animal is eating");
	}
}
