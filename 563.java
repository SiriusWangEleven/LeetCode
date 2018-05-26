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

//	static int sum = 0;

	static public int findTilt(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		calSum(root,list);
		return list.get(0);
		
	}

	static public int calSum(TreeNode root, ArrayList<Integer> list) {
		if (root == null)
			return 0;
		int lSum = 0;
		int rSum = 0;
		int lrSum = root.val;
		lSum += calSum(root.left, list);
		rSum += calSum(root.right, list);
		int tmp = list.get(0);
		list.set(0, tmp + Math.abs(lSum - rSum));
//		sum += Math.abs(lSum - rSum);
		lrSum += lSum + rSum;
		return lrSum;
	}

	public static void main(String[] args) {
		TreeNode a0 = new TreeNode(1);
		TreeNode a1 = new TreeNode(2);
		TreeNode a2 = new TreeNode(2);
		
		a0.right = a2;

		System.out.println(findTilt(a0));

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