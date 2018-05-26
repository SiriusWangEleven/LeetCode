public class Main {
	public static void main(String[] args) {

		System.out.println(rotatedDigits(857));

	}

	static public int rotatedDigits(int N) {
		int[] a = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			a[i] = a[i - 1];
			if (isValid(i))
				a[i]++;

		}
		return a[N];
	}

	static public boolean isValid(int n) {
		int value = 0;
		while (n > 0) {
			int rest = n % 10;
			switch (rest) {
			case 2:
			case 5:
			case 6:
			case 9:
				value++;
				break;
			case 0:
			case 1:
			case 8:
				break;

			default:
				value = -1;
				break;
			}
			if (value < 0)
				break;
			n /= 10;
		}
		if (value > 0)
			return true;
		return false;
	}

}