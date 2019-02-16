package arraylist;

public class AnimalReserve {

	public static void main(String[] args) {

		int[] nums = new int[4];
		int n = 10;
		nums[0] = n;
		nums[1] = 1234;
		nums[2] = 45;
		nums[3] = 88;

		for (int num : nums) {
			System.out.println(num);
		}

		Animal[] animals = new Animal[4];
		Animal animal1 = new Animal("Cat");

		animals[0] = animal1;
		animals[1] = new Animal("Lion");
		animals[2] = new Animal("Leopard");
		animals[3] = new Animal("Cheetah");

		for (Animal myAnimal : animals) {
			System.out.println(myAnimal.getName());

		}
		// Animal[] myAnimals={new Animal("Tiger"),new Animal("Donkey"),new
		// Animal("Monkey"){
		// String[] yourAnimals={"Cat","Dog","Bird"};

	}

}
