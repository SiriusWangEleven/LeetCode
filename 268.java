public class Main {

	public static void main(String[] args) {

		System.out
				.println(missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));

	}

	static public int missingNumber(int[] nums) {
		int x = 0;
		for (int i = 0; i < nums.length; i++) {
			x = x ^ i;
			x = x ^ nums[i];
		}
		x = x ^ nums.length;
		return x;

	}

}