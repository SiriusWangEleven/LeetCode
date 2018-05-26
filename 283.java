public class Main {
	public static void main(String[] args) {
		int[] nums = { 0, 1};
		moveZeroes(nums);
	}

	static public void moveZeroes(int[] nums) {
		if (nums == null)
			return;

		int l = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0 && l > -1) {
				nums[l] = nums[i];
				nums[i] = 0;
				l++;
			}else if(nums[i] == 0 && l == -1){
				l = i;
			}
		}
	}
}