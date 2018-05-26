import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,7,8,7};
		System.out.println(findDisappearedNumbers(nums));
	}

	static public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> ans = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int id = Math.abs(nums[i]) - 1;
			if (nums[id] > 0)
				nums[id] = -nums[id];
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				ans.add(i + 1);
		}

		return ans;
	}
}