public class Main {
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAzzz"));
	}

	static public int numJewelsInStones(String J, String S) {
		if (J == null || S == null)
			return 0;

		int cnt = 0;
		boolean[] jew = new boolean[256];
		for (int i = 0; i < J.length(); i++)
			jew[(int) J.charAt(i)] = true;

		for (int i = 0; i < S.length(); i++) {
			if (jew[(int) S.charAt(i)])
				cnt++;
		}

		return cnt;
	}

}