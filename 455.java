import java.util.Arrays;

public class Main {

	public int findContentChildren(int[] g, int[] s) {
		if (g == null || s == null)
			return 0;
		Arrays.sort(g);
		Arrays.sort(s);
		int cnt = 0;
		int i = 0, j = 0;
		while (j < s.length && i < g.length) {
			if (g[i] <= s[j]) {
				cnt++;
				i++;
				j++;
			} else {
				j++;
			}
		}
		return cnt;

	}

	public static void main(String[] args) {

		Main mo = new Main();
		int[] g = { 4 };
		int[] s = { 1, 1, 3 };
		System.out.println(mo.findContentChildren(g, s));

	}

}