import java.util.ArrayList;
import java.util.List;

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
		t[1].left = t[0];
		t[1].right = t[4];
		t[4].left = t[3];
		t[3].left = t[2];
		

		// printTreeMiddle(t[5]);
		System.out.println(findTarget(t[1], 7));

	}

	static boolean findTarget(TreeNode root, int k) {
		List<Integer> list = new ArrayList<Integer>();
		getSorted(list, root);
//		System.out.println(list);
		// System.out.println(findInTree(root, 2));
		for (int i = 0; i < list.size(); i++) {

			int now = list.get(i);
			int left = k - now;
			// System.out.println("left == " + left);
			if (left * 2 == k && findInTree(root, left) >= 2)
				return true;
			else if (left * 2 != k && findInTree(root, left) >= 1)
				return true;

		}
		return false;
	}

	static void printTree(TreeNode head) {
		if (head == null)
			return;
		System.out.println(head.val + " ");
		printTree(head.left);
		printTree(head.right);

	}

	static int findInTree(TreeNode head, int val) {
		if (head == null)
			return 0;
		int sum = 0;
		if (head.val == val)
			sum = 1;
		if (head.val < val)
			sum += findInTree(head.right, val);
		else {
			sum += findInTree(head.left, val);
		}
		return sum;
	}

	static void printTreeMiddle(TreeNode head) {
		if (head == null)
			return;

		printTreeMiddle(head.left);
		System.out.println(head.val + " ");
		printTreeMiddle(head.right);

	}

	static void getSorted(List<Integer> list, TreeNode head) {
		if (head == null)
			return;

		getSorted(list, head.left);
		list.add(head.val);
		getSorted(list, head.right);
	}
}