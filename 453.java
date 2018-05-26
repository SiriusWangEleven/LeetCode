public class Main {

	public int minMoves(int[] nums) {
		int min = Integer.MAX_VALUE;
		for (int i : nums)
			min = Math.min(min, i);
		int sum = 0;
		for (int i : nums)
			sum += i - min;
		return sum;

	}

	public static void main(String[] args) {

		Main mo = new Main();
		int[] ops = { 83, 86, 77, 15, 93, 35, 86, 92, 49, 21 };
		System.out.println(mo.minMoves(ops));

	}

}