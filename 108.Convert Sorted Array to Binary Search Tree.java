import java.util.ArrayList;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class LeetCode {

	static public TreeNode sortedArrayToBST(int[] nums) {
		TreeNode head = buildTree(nums, 0, nums.length - 1);
		return head;
	}

	static public TreeNode buildTree(int[] nums, int l, int r) {
		if (l > r)
			return null;
		int mid = (l + r) >> 1;
		TreeNode head = new TreeNode(nums[mid]);
		head.left = buildTree(nums, l, mid -1);
		head.right = buildTree(nums, mid + 1, r);
		return head;
	}

	public static void main(String[] args) {
		int[] nums = {-10,-3,0,5,9};
		TreeNode head = sortedArrayToBST(nums);
		printTree(head);

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