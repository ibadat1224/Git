package inheritance;

public class Family {

	public static void main(String[] args) {
		Parent dad = new Parent();
		dad.name = " Meder";
		dad.sayName();

		Child son = new Child();
		son.name = " Bakay";
		son.sayName();

		Animal cheetah = new Animal();
		cheetah.setName(" Cheetah");
		System.out.println(cheetah.toString());

		Pet myPet = new Pet();
		myPet.setName(" Doobey");
		System.out.println(myPet.toString());

		Dog puppy = new Dog();
		puppy.setName(" Cooper");
		System.out.println(puppy.toString());

	}

}
