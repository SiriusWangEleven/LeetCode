import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		System.out.println(uniqueMorseRepresentations(new String[] { "gin",
				"zen", "gig", "msg" }));
	}

	static public int uniqueMorseRepresentations(String[] words) {
		String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
				"....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
				"--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
				"-.--", "--.." };
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < words.length; i++) {
			StringBuffer sb = new StringBuffer("");
			for (int j = 0; j < words[i].length(); j++) {
				sb.append(morse[words[i].charAt(j) - 'a']);
			}
			set.add(sb.toString());
		}
		return set.size();
	}
}