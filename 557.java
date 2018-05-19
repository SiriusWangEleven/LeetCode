public class Main {
	public static void main(String[] args) {
		System.out.println(reverseString("Let's take LeetCode contest"));

	}

	static public String reverseString(String s) {
		if (s == null)
			return null;
		String[] strs = s.split(" ");
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < strs.length; i++) {
			StringBuffer tmp = new StringBuffer(strs[i]);
			sb.append(tmp.reverse().toString());
			sb.append(" ");
		}
		return sb.toString().trim();
	}
}