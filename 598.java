public class Main {

	public int maxCount(int m, int n, int[][] ops) {

		for (int i = 0; i < ops.length; i++) {
			m = Math.min(m, ops[i][0]);
			n = Math.min(n, ops[i][1]);
		}
		return m * n;
	}

	public static void main(String[] args) {

		Main mo = new Main();
		int[][] ops = { { 2, 2 }, { 3, 3 } };
		System.out.println(mo.maxCount(3, 3, ops));

	}

}