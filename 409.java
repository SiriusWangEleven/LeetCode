public class Main {

	public static void main(String[] args) {

		System.out.println(longestPalindrome("abccccdd"));

	}

	static public int longestPalindrome(String s) {
		int sum = 0;
		int[] cnt = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			cnt[ch]++;
		}
		int maxOdd = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] % 2 == 1) {
				maxOdd = 1;
				sum += cnt[i] - 1;
			} else {
				sum += cnt[i];
			}
		}
		sum += maxOdd;
		return sum;
	}

}