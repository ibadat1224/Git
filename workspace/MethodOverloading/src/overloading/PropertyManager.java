package overloading;

public class PropertyManager {

	public static void main(String[] args) {

		House.neighbourhood = "Cybertek";

		House h1 = new House();
		House h2 = new House(123);
		h2.neighbourhood = "Cybertek 123";

		House h3 = new House("TownHouse", 124, 500000);

		System.out.println(h1.getHouseNumber());
		System.out.println(h2.getHouseNumber());
		System.out.println(h3.getHouseNumber());

		System.out.println(House.neighbourhood);
	}

}
