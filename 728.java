import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		System.out.println(selfDividingNumbers(1, 22));
	}

	static public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			if (selfDivide(i))
				list.add(i);
		}
		return list;
	}

	static public boolean selfDivide(int n) {
		int tmp = n;
		while (tmp > 0) {
			int left = tmp % 10;
			if (left == 0 || n % left != 0)
				return false;
			tmp /= 10;
		}
		return true;
	}

}