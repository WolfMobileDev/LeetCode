package 链表;
 /** 
 * @abstract https://leetcode-cn.com/problems/reverse-linked-list/
 * @author jinru.lu
 * @version Apr 27, 2019 12:07:19 PM
 */
public class _206_反转链表 {
	
	public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
	
	public ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = null;
		while (head != null) {
			ListNode tmpNode = head.next;
			head.next = newHead;  
			newHead = head; 
			head = tmpNode; 
		}
		 
		return newHead;
	}
}
