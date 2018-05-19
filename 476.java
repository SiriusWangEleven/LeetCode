public class Main {
	public static void main(String[] args) {
		System.out.println(findComplement(2));

	}

	static public int findComplement(int num) {
		int ans = (int) (Math.log(num) / Math.log(2));
		if (Math.pow(2, ans) <= num)
			ans++;
		return (int) (Math.pow(2, ans) - 1) ^ num;
	}
}