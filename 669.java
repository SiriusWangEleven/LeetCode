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
		TreeNode[] t = new TreeNode[8];
		for (int i = 0; i < 8; i++)
			t[i] = new TreeNode(i);
		t[3].left = t[1];
		t[1].right = t[2];
		t[3].right = t[4];

		printTree(trimBST(t[3], 3, 4));

	}

	static public TreeNode trimBST(TreeNode root, int L, int R) {
		if (root == null)
			return null;
//		System.out.println(root.val + " " + L + " " + R);

		if (root.val >= L && root.val <= R) {
			root.left = trimBST(root.left, L, root.val);
			root.right = trimBST(root.right, root.val, R);
		} else if (root.val < L) {
			root = trimBST(root.right, L, R);
		} else if (root.val > R) {
			root = trimBST(root.left, L, R);
		}
		return root;

	}

	static void printTree(TreeNode head) {
		if (head == null)
			return;
		System.out.println(head.val + " ");
		printTree(head.left);
		printTree(head.right);

	}
}