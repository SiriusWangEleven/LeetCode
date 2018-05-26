import java.util.Arrays;

public class Main {

	public static int[] twoSum(int[] numbers, int target) {
		int[] ans = new int[2];

		int i = 0;
		int j = -1;
		while (i < numbers.length - 1 && target - numbers[i] >= numbers[i]) {
			j = bi_search(numbers, target - numbers[i], i + 1,
					numbers.length - 1);
			if (j != -1)
				break;
			i ++;
		}

		ans[0] = i + 1;
		ans[1] = j + 1;

		return ans;
	}

	public static int bi_search(int[] a, int val, int l, int r) {
		if (l >= r) {
			if (a[l] == val)
				return l;
			return -1;
		}
		int mid = (l + r) >> 1;
		if (a[mid] < val) {
			return bi_search(a, val, mid + 1, r);
		} else {
			return bi_search(a, val, l, mid);
		}

	}

	public static void main(String[] args) {

		int[] a = { 5, 5, 8, 8, 9, 11 };

		// System.out.println(bi_search(a, 5, 1, a.length-1));

		System.out.println(Arrays.toString(twoSum(a, 20)));

	}

}