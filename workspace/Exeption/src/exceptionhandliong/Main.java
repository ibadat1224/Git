package exceptionhandliong;

import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		Furniture furniture = new Furniture();

		try {
			furniture.assemble();
		} catch (SQLException e) {
			System.out.println("catching exception");
			e.printStackTrace();
		}

	}

}
