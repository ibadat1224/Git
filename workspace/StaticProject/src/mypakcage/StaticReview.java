package mypakcage;

public class StaticReview {

	public static void main(String[] args) {

		/// Static method can not have any instanse members
		/// Instant method can have both instanse members and static members

		Rocket r1 = new Rocket(100, "SpaceX", 24, false);
		Rocket r2 = new Rocket(120, "Apollo", 21, true);

		r1.launch();
		r2.launch();

		System.out.println(Rocket.counter);
		System.out.println(Rocket.LauchPad);

		r1.LauchPad = "LaunchPad2";
		System.out.println(Rocket.LauchPad);
		System.out.println(r2.LauchPad);

		Rocket.capsulate();

	}

}
