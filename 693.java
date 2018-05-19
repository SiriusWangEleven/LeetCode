public class Main {
	public static void main(String[] args) {
		for (int i = 0; i <= 6; i++)
			System.out.println(hasAlternatingBits(i));
	}

	static public boolean hasAlternatingBits(int n) {
		if (n <= 1)
			return true;
		int now = n % 2;
		n /= 2;
		while (n > 0) {
			int tmp = n % 2;
			if ((now ^ tmp) == 0)
				return false;
			now = tmp;
			n /= 2;
		}
		return true;
	}
}