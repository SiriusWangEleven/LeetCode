public class Main {
	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 2, 2, 3, 4 };
		int len = removeDuplicates(a);
		for (int i = 0; i < len; i++)
			System.out.print(a[i] + " ");
	}

	static int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		int len = nums.length;
		int now = nums[0];
		int size = 1;
		for (int i = 1; i < len; i++) {
			if (nums[i] == now) {
				continue;
			} else {
				nums[size++] = nums[i];
				now = nums[i];
			}
		}

		return size;
	}

}