package polymorphism;

public class Horse extends Animal {

	@Override
	public void eat() {
		System.out.println("Horse is eating");
	}

	public static void main(String[] args) {
		// Horse h1 = new Horse();
		Animal a1 = new Horse();
		// a1 = new Cat();
		// a1 = new Dog();

		Mammal m1 = new Horse();

		// eat();
		// a1.eat();
		// m1.eat();
		// Object o1 = new Horse();

		Animal[] farmAnimal = new Animal[3];
		farmAnimal[0] = new Dog();
		farmAnimal[1] = new Horse();
		farmAnimal[2] = new Cat();

		for (Animal each : farmAnimal) {
			each.eat();
		}

	}
}
