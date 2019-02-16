package array;

public class Array2D {

	public static void main(String[] args) {
		int[][] a;
		a = new int[3][];
		a[0] = new int[10];
		a[1] = new int[20];
		a[2] = new int[50];

		a[1][5] = 99;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + ",");
			}
			System.out.println();
		}

	}

}
