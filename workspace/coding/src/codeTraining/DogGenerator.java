package codeTraining;

public class DogGenerator {

	public static void main(String[] args) {
		String[] names = { "puppy1", "puppy2", "puppy3" };
		int[] sizes = { 10, 9, 20, 88, 2 };

		Dog[] manyDogs = new Dog[5];
		for (int i = 0; i < manyDogs.length; i++) {
			manyDogs[i] = new Dog();
			manyDogs[i].name = names[i];
			manyDogs[i].size = sizes[i];
		}
		for (Dog eachDog : manyDogs) {
			eachDog.bark();
		}
	}

}
