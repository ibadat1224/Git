package codeTraining;

public class DogAction {

	public static void main(String[] args) {

		// instantiation=creating an object
		// instance of class---> object
		Dog d1 = new Dog();
		d1.name = "puppy ";
		d1.size = 9;
		// d1.bark();
		// System.out.println(d1.play("park"));

		d1 = new Dog();
		d1.name = "hachi ";
		d1.size = 10;
		// d1.bark();
		// System.out.println(d1.play("park"));

		Dog d3 = new Dog();
		d3.name = "pitbull ";
		d3.size = 11;
		// d3.bark();
		// System.out.println(d3.play("park"));
		String[] names = { "AAA", "CCC" };
		Dog[] manyDogs = new Dog[3];
		manyDogs[0] = d1;
		manyDogs[1] = new Dog();
		manyDogs[2] = d3;
		for (int i = 0; i < manyDogs.length; i++) {
			manyDogs[i].bark();
		}
		Dog[] manyDogs1 = new Dog[] { d1, d3 };
		Dog[] manyDogs2 = new Dog[] { d1, d3, new Dog() };

	}

}
