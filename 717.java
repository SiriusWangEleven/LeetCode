public class Main {

	public boolean isOneBitCharacter(int[] bits) {
		int c1 = 0;
		for (int i = 0; i < bits.length - 1; i++) {
			if (bits[i] == 1) {
				c1 = c1 ^ 1;
			} else if (bits[i] == 0) {
				c1 = c1 & 0;
			}
		}
		return c1 > 0 ? false : true;
	}

	public static void main(String[] args) {

		Main mo = new Main();
		int[] bits = { 1, 0, 0 };
		System.out.println(mo.isOneBitCharacter(bits));
	}

}