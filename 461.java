public class Main {
	public static void main(String[] args) {
		System.out.println(hammingDistance(Integer.MAX_VALUE, 1));
	}

	static public int hammingDistance(int x, int y) {
		int cnt = 0;
		int sum = x ^ y;
		while (sum > 0) {
			cnt += sum % 2;
			sum /= 2;
		}
		return cnt;
	}
}