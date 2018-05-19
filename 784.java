import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class Main {
	public static void main(String[] args) {

		System.out.println(letterCasePermutation(""));

	}

	static public List<String> letterCasePermutation(String S) {
		if (S == null)
			return null;
		List<String> list = new ArrayList<>();
		dfs(list, new StringBuffer(S), 0, S.length());
		return list;

	}

	static void dfs(List<String> list, StringBuffer s, int id, int len) {
		if (id == len) {
			list.add(s.toString());
			return;
		}
		char ch = s.charAt(id);
		if (!isLetter(ch))
			dfs(list, s, id + 1, len);
		else {
			s.setCharAt(id, Character.toLowerCase(ch));
			dfs(list, s, id + 1, len);
			s.setCharAt(id, Character.toUpperCase(ch));
			dfs(list, s, id + 1, len);
		}

	}

	static boolean isLetter(char ch) {
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z')
			return true;
		return false;
	}

}