package overriding;

public class Parking {

	static public void main(String[] args) {
		// Vehicle vehicle=new Vehicle();
		// CompactCar comp=new CompactCar();
		// Bus bus=new Bus();

		// vehicle.setMake("Kia");
		// comp.setMake("Mini Cooper");
		// bus.setMake("Mercedes");

		// vehicle.move();
		// comp.move();
		// bus.move();
		Car car = new Car();
		car.setMake("Fiat");
		car.move();

		Bus bus2 = new Bus();
		bus2.setMake("Ford");
		bus2.move();
		bus2.addGas(10);
	}

}
