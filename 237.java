class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		this.val = x;
	}
}

public class Main {

	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

	public static void main(String[] args) {

		Main mo = new Main();
		ListNode[] nodes = new ListNode[4];
		for (int i = 0; i < 4; i++) {
			nodes[i] = new ListNode(i);
		}
		for (int i = 0; i < 3; i++)
			nodes[i].next = nodes[i + 1];

		mo.deleteNode(nodes[2]);
		print(nodes[0]);
	}

	static void print(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}

	}

}