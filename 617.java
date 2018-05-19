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
		TreeNode t1n5 = new TreeNode(5);
		TreeNode t1n3 = new TreeNode(3);
		t1n3.left = t1n5;
		TreeNode t1n1 = new TreeNode(1);
		t1n1.left = t1n3;
		TreeNode t1n2 = new TreeNode(2);
		t1n1.right = t1n2;
//		printTree(t1n1);
//		System.out.println();

		TreeNode t2n7 = new TreeNode(7);
		TreeNode t2n3 = new TreeNode(3);
		t2n3.right = t2n7;
		TreeNode t2n2 = new TreeNode(2);
		t2n2.right = t2n3;
		TreeNode t2n1 = new TreeNode(1);
		t2n2.left = t2n1;
		TreeNode t2n4 = new TreeNode(4);
		t2n1.right = t2n4;
//		printTree(t2n2);
		
		TreeNode head = mergeTrees(null, null);
		printTree(head);

	}

	static public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null)
			return t2;
		if (t2 == null)
			return t1;
		TreeNode head = new TreeNode(t1.val + t2.val);
		head.left = mergeTrees(t1.left, t2.left);
		head.right = mergeTrees(t1.right, t2.right);
		return head;
	}

	static void printTree(TreeNode head) {
		if (head == null)
			return;
		System.out.println(head.val + " ");
		printTree(head.left);
		printTree(head.right);

	}
}