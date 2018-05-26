import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 2, 3, 1 };
		System.out.println(findShortestSubArray(nums));

	}

	static public int findShortestSubArray(int[] nums) {
		/*
			if frequency of element x == frequency of Array
			then
				the right-most id x is right[x]
				the left-most id x is left[x]
				the shortest length of sub array for element x is right[x] - left[x] + 1
			loop all such elements whose frequency equals to frequency of array
			find the shortest gap
		*/
		int[] left = new int[50005];
		int[] right = new int[50005];
		int[] gap = new int[50005];
		int fre = 0;
		int[] cnt = new int[50005];
		Arrays.fill(left, -1);
		for (int i = 0; i < nums.length; i++) {
			if (left[nums[i]] == -1)
				left[nums[i]] = i;
			right[nums[i]] = i;
			cnt[nums[i]] ++;
			fre = Math.max(fre, cnt[nums[i]]);
			gap[nums[i]] = right[nums[i]] - left[nums[i]] + 1;
		}
//		System.out.println(Arrays.toString(gap));
		int ans = 50005;
		for (int i = 0; i < gap.length; i++) {
			if (gap[i] > 0 && fre == cnt[i]) {
				ans = Math.min(ans, gap[i]);
			}
		}
		return ans;
	}

}