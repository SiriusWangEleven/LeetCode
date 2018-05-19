import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
		System.out.println(subdomainVisits(cpdomains));
	}

	static public List<String> subdomainVisits(String[] cpdomains) {
		if (cpdomains == null)
			return null;
		HashMap<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < cpdomains.length; i++) {
			String str[] = cpdomains[i].split(" ");
			int cnt = Integer.parseInt(str[0]);
			StringBuffer sb = new StringBuffer(str[1]);

			while (sb.indexOf(".") >= 0) {
				if (map.containsKey(sb.toString()))
					map.put(sb.toString(), map.get(sb.toString()) + cnt);
				else {
					map.put(sb.toString(), cnt);
				}
				sb.delete(0, sb.indexOf(".") + 1);
			}
			if (map.containsKey(sb.toString()))
				map.put(sb.toString(), map.get(sb.toString()) + cnt);
			else {
				map.put(sb.toString(), cnt);
			}

		}
		for (String str : map.keySet()) {
			int cnt = map.get(str);
			list.add(new String(cnt + " " + str));
		}
		return list;
	}
}