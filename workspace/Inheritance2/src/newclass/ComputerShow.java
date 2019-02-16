package newclass;

import newpackage.Mac;
import newpackage.PC;

public class ComputerShow {

	public static void main(String[] args) {
		PC p = new PC();
		p.storage = 122.2;
		p.ramType = "CD";
		p.compute();

		Mac m = new Mac();
		m.ramType = "SolidState";
		m.storage = 123.3;
		m.macOSVersion = 512.0;
		m.compute();

	}

}
