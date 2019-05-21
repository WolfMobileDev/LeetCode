package 链表;
 /** 
 * @abstract https://leetcode-cn.com/problems/middle-of-the-linked-list/
 * @author jinru.lu
 * @version 2019年5月6日 下午11:50:39
 */
public class _876_链表的中间结点 {
	// 1 2 3 4 5 6 7 8 9
	   
	// 1 2 3 4 5 6
	// 1 2 3
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		
		_876_链表的中间结点 node = new _876_链表的中间结点();
		System.out.println(node.middleNode(node1).val);;
	}
	
	public ListNode middleNode(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode slowNode = head;
		ListNode fastNode = head;
		while (fastNode != null && fastNode.next != null) {
			System.out.println("slowNode is "+slowNode.val+" fastNode is "+fastNode.val);
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		
        return slowNode;
    }
}
