public class Main {
	public static void main(String[] args) {
		System.out.println(findTheDifference("abcd", "abcde"));
	}

	static public char findTheDifference(String s, String t) {
		int[] asc = new int[1024];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			asc[ch]++;
		}
		char ch = ' ';
		for (int i = 0; i < t.length(); i++) {
			ch = t.charAt(i);
			asc[ch]--;
			if (asc[ch] < 0)
				break;
		}
		return ch;
	}
}