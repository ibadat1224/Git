
public class Cars {

	public static void main(String[] args) {
		String[] cars = { "BMW", "KIA", "GMC", "Ford", "Fiat", "Honda", "Toyota" };
		System.out.println(cars.length);
		for (String car : cars) {
			System.out.println(car);
		}
		for (int idx = 0; idx < cars.length; idx++) {
			System.out.println(cars[idx]);
		}
		System.out.println("#########");
		System.out.println(cars[cars.length - 1]);

	}

	public static int[] buildArray(int n1, int n2, int n3, int n4, int n5) {
		int[] nums = new int[5];
		nums[0] = n1;
		nums[1] = n2;
		nums[2] = n3;
		nums[3] = n4;
		nums[4] = n5;
		// int[] nums2={n1,n2,n3,n4,n5};
		return nums;
	}

	int[] numbers = buildArray(5, 3, 6, 7, 4);
	int[] nums2=buildArray(234,6456,2134,456,345);for(
	int i:nums2)
	{
		System.out.println(i);
	}

}

}