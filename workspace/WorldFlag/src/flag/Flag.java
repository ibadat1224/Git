package flag;

import java.awt.Color;

public class Flag {

	public static void main(String[] args) {

		Grid grid = new Grid();

		System.out.println("Grid Height is : " + grid.getHt());
		System.out.println("Grid Width is : " + grid.getWd());

		grid.setColor(0, 0, Color.RED);
		grid.setColor(0, 0, Color.BLUE);

		grid.setColor(grid.getHt(), grid.getWd(), Color.BLACK);

	}

}
