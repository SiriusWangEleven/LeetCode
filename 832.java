public class Main {
	public static void main(String[] args) {

		int[][] A = { { 1 } };
		A = flipAndInvertImage(A);
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}
		// System.out.println(1 ^ 1);
	}

	static public int[][] flipAndInvertImage(int[][] A) {
		int n = A.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n / 2; j++) {
				if (A[i][j] == A[i][n - 1 - j]) {
					A[i][j] = A[i][n - 1 - j] = 1 ^ A[i][j];
				}
			}
			if (n % 2 == 1)
				A[i][n / 2] = A[i][n / 2] ^ 1;
		}
		return A;
	}
}