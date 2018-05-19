import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		System.out.println(distributeCandies(new int[] { 1, 1, 2, 3}));

	}

	static public int distributeCandies(int[] candies) {
		Arrays.sort(candies);
		int now = 1000005;
		int sis = 0;
		for (int i = 0; i < candies.length; i++) {
			if (now != candies[i]) {
				sis++;
				now = candies[i];
			}
		}
		return Math.min(sis, candies.length / 2);
	}
}