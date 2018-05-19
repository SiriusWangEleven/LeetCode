import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(shortestToChar("loveleetcode", 'e')));
	}

	static public int[] shortestToChar(String S, char C) {
		int[] ans = new int[S.length()];
		ArrayList<Integer> cIndex = new ArrayList<>();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == C) {
				cIndex.add(i);
				ans[i] = 0;
			}
		}
		int first = cIndex.get(0);
		int last = cIndex.get(cIndex.size() - 1);
		for (int i = 0; i < first; i++)
			ans[i] = first - i;
		for (int i = last + 1; i < S.length(); i++)
			ans[i] = i - last;

		//System.out.println(Arrays.toString(ans));
		
		for (int i = 0; i + 1 < cIndex.size(); i++) {
			int left = cIndex.get(i);
			int right = cIndex.get(i + 1);

			for (int j = left; j <= (left + right) / 2; j++)
				ans[j] = j - left;
			for (int j = (left + right) / 2 + 1; j < right; j++)
				ans[j] = right - j;
		}
		return ans;
	}
}