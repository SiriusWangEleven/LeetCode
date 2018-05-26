class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class LeetCode {

	static public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null) {
			if (q == null)
				return true;
			else {
				return false;
			}
		} else {
			if (q == null || p.val != q.val)
				return false;
			return isSameTree(p.left, q.left) & isSameTree(p.right, q.right);
		}
	}

	public static void main(String[] args) {
		TreeNode a0 = new TreeNode(0);
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		a0.left = a1;
		

		TreeNode b0 = new TreeNode(0);
		TreeNode b1 = new TreeNode(1);
		TreeNode b2 = new TreeNode(2);
		
		b0.right = b1;

		System.out.println(isSameTree(a0, b0));

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