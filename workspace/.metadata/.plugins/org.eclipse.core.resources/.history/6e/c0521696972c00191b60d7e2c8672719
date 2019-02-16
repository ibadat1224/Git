package exceptionhandliong;

import java.sql.SQLException;

public class Furniture {

	public void assemble() throws SQLException {
		System.out.println("Assembling furniture");
	}

	public void sell(double price) {
		System.out.println("selling furniture");
	}

	class Desk extends Furniture {

		// Totally fine
		// public void assemble() throws IOException{
		// System.out.println("Assembling a desk");
		// }

		// // not possible to throw parent exception type
		// public void assemble()throws Throwable{
		// System.out.println("Assembling a desk");
		// }

		// totally fine not throwing an exception
		public void assemble() {
			System.out.println("Assembling a desk");
		}
		// cannot be thrown
		// public void sell(double price) throws SQLException
		//
		// System.out.println("selling desk");
		//

	}
}
