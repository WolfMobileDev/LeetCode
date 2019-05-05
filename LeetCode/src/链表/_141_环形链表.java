package 链表;
 /** 
 * @abstract https://leetcode-cn.com/problems/linked-list-cycle/
 * @author jinru.lu
 * @version Apr 27, 2019 9:17:02 PM
 */
public class _141_环形链表 {
	
	public boolean hasCycle(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slowNode = head;
		ListNode fasNode = head.next;
		while (fasNode != null && fasNode.next != null) {
			if (slowNode == fasNode) {
				return true;
			}
			slowNode = slowNode.next;
			fasNode = fasNode.next.next;
		}
        return false;
    }
}
