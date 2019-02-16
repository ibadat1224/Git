package wrapper;

import java.util.ArrayList;

public class TruckShow {

	public static void main(String[] args) {
		Truck t1 = new Truck("Monster Truck 1 ", 2018, 100000);
		Truck t2 = new Truck("Monster Truck 2 ", 2022, 150000);
		Truck t3 = new Truck("Monster Truck 3 ", 2023, 160000);
		Truck t4 = new Truck("Monster Truck 4 ", 2025, 400000);
		Truck t5 = new Truck("Monster Truck 5 ", 2030, 500000);

		// List<Truck> lst =Arrays.asList(t1,t2,t3,t4,t5);
		ArrayList<Truck> lst = new ArrayList<>();
		lst.add(t1);
		lst.add(t2);
		lst.add(t3);
		lst.add(t4);
		lst.add(t5);

		for (int i = 0; i < lst.size(); i++) {
			Truck each = lst.get(i);
			System.out.println(each.toString());
			double originalPrice = (lst.get(i).getPrice());
			lst.get(i).setPrice(originalPrice + originalPrice * 0.1);

		}
		System.out.println("------------");
		for (Truck each : lst) {
			System.out.println(each.toString());
		}
	}

}
