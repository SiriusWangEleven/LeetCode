class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class LeetCode {

	static public String tree2str(TreeNode t) {
		StringBuffer sb = new StringBuffer("");
		readTree(sb, t);
		return sb.toString();
	}

	public static void main(String[] args) {
		TreeNode[] t = new TreeNode[8];
		for (int i = 0; i < 8; i++)
			t[i] = new TreeNode(i);
		t[1].left = t[2];
		t[1].right = t[3];
		t[2].right = t[4];

		System.out.println(tree2str(t[1]));

	}

	static void printTree(TreeNode head) {
		if (head == null)
			return;
		System.out.println(head.val + " ");
		printTree(head.left);
		printTree(head.right);

	}

	static void printTreeMiddle(TreeNode head) {
		if (head == null)
			return;

		printTreeMiddle(head.left);
		System.out.println(head.val + " ");
		printTreeMiddle(head.right);

	}

	static void readTree(StringBuffer sb, TreeNode head) {
		if (head == null)
			return;
		sb.append(String.valueOf(head.val));

		if (head.left == null) {
			if (head.right != null) {
				sb.append("()(");
				readTree(sb, head.right);
				sb.append(")");
			}
			return;
		}
		sb.append("(");
		readTree(sb, head.left);
		sb.append(")");
		if (head.right != null) {
			sb.append("(");
			readTree(sb, head.right);
			sb.append(")");
		}
		return;
	}
}