class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class Main {

	static public ListNode reverseList(ListNode head) {
		ListNode now = null;
		while (head != null) {
			ListNode tmp = new ListNode(head.val);
			tmp.next = now;
			now = tmp;
			head = head.next;
		}
		return now;
	}

	public static void main(String[] args) {

		ListNode[] nodes = new ListNode[6];
		for (int i = 1; i <= 5; i++)
			nodes[i] = new ListNode(i);
		for (int i = 1; i <= 4; i++)
			nodes[i].next = nodes[i + 1];
		print(reverseList(nodes[1]));

	}

	static void print(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

	}

}