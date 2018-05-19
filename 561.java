import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
		System.out.println(arrayPairSum(new int[] { 1, 2, 3, 4 }));
	}

	static public int arrayPairSum(int[] nums) {
		if (nums == null)
			return 0;
		int sum = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i += 2)
			sum += nums[i];
		return sum;
	}

}