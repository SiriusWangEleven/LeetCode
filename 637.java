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
		TreeNode[] t = new TreeNode[5];
		t[0] = new TreeNode(3);
		t[1] = new TreeNode(9);
		t[2] = new TreeNode(20);
		t[3] = new TreeNode(15);
		t[4] = new TreeNode(7);
		t[0].left = t[1];
		t[0].right = t[2];
		t[2].left = t[3];
		t[2].right = t[4];
		
		System.out.println(averageOfLevels(t[0]));
	}

	static public List<Double> averageOfLevels(TreeNode root) {

		if (root == null)
			return null;
		List<Double> list = new ArrayList<Double>();
		List<Double> sum = new ArrayList<>();
		List<Integer> cnt = new ArrayList<>();
		bfs(sum, cnt, root, 0);
		for (int i = 0; i < sum.size(); i++)
			list.add(sum.get(i) / cnt.get(i));
		
		return list;

	}

	static public void bfs(List<Double> sum, List<Integer> cnt, TreeNode root, int depth) {
		
		if (root == null)
			return;
//		System.out.println(root.val + " " + depth);
		
		if (cnt.size() <= depth) {
			cnt.add(1);
			sum.add((double) root.val);
		} else {
			cnt.set(depth, cnt.get(depth) + 1);
			sum.set(depth, sum.get(depth) + root.val);
		}
		bfs(sum, cnt, root.left, depth + 1);
		bfs(sum, cnt, root.right, depth + 1);
	}

}