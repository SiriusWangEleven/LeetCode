import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
				10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
		String s = "bbbcccdddaaa";
		System.out.println(Arrays.toString(numberOfLines(widths, s)));
	}

	static public int[] numberOfLines(int[] widths, String S) {
		int cnt = 1;
		int index = 0;
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (index + widths[c - 'a'] > 100) {
				cnt++;
				index = widths[c - 'a'];
			} else {
				index += widths[c - 'a'];
			}
		}
		int[] ans = { cnt, index };
		return ans;
	}

}