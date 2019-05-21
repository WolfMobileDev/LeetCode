package 链表;
 /** 
 * @abstract https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 * @author jinru.lu
 * @version 2019年5月6日 下午11:06:05
 */
public class _83_删除排序链表中的重复元素 {
	
//	输入: 1->1->2->3->3
//	输出: 1->2->3
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		_83_删除排序链表中的重复元素 _83_ = new _83_删除排序链表中的重复元素();
		System.out.println(_83_.deleteDuplicates(node1).val);
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		ListNode currentNode = head;
		while (currentNode != null && currentNode.next != null) {
			if (currentNode.val == currentNode.next.val) {
				currentNode.next = currentNode.next.next;
			} else {
				currentNode = currentNode.next;
			}
		}
		
        return head;
    }
}
