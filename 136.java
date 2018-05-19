public class Main {
	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] { 2, 2, 1, 1, 4 }));
	}

	static public int singleNumber(int[] nums) {
		int ans = 0;
		for (int i = 0; i < nums.length; i++)
			ans = ans ^ nums[i];
		return ans;
	}
}