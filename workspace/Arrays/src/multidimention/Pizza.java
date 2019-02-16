package multidimention;

public class Pizza {

	public static void main(String[] args) {

		int[][] arr = new int[7][3];
		arr[0][0] = 0;
		arr[0][1] = 1;
		arr[0][2] = 2;
		arr[1][0] = 10;
		arr[1][1] = 11;
		arr[1][2] = 12;
		arr[2][0] = 20;
		arr[2][1] = 21;
		arr[2][2] = 22;
		arr[3][0] = 30;
		arr[3][1] = 31;
		arr[3][2] = 32;
		arr[4][0] = 40;
		arr[4][1] = 41;
		arr[4][2] = 42;
		arr[5][0] = 50;
		arr[5][1] = 51;
		arr[5][2] = 52;
		arr[6][0] = 60;
		arr[6][1] = 61;
		arr[6][2] = 62;

		/// using length method with multi demensinal array

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Slice " + i + ":");
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Bite " + (j + 1) + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" slice number " + (i + 1) + " :");

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("Bite value " + arr[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println("---------");

		for (int[] eachSlice : arr) {
			for (int bite : eachSlice) {
				System.out.print(bite + " ");

			}
			System.out.println();
		}

	}

}
