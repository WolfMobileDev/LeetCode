package 链表;
 /** 
 * @abstract https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author jinru.lu
 * @version 2019年5月21日 下午11:35:29
 */
public class _21_合并两个有序链表 {
	
//	输入：1->2->4, 1->3->4
//	输出：1->1->2->3->4->4
	
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(4);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		
		ListNode listNode4 = new ListNode(1);
		ListNode listNode5 = new ListNode(3);
		ListNode listNode6 = new ListNode(7);
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		
		_21_合并两个有序链表 node = new _21_合并两个有序链表();
		ListNode newNode = node.mergeTwoLists(listNode1, listNode4);
		while (newNode != null) {
			System.out.println("newNode.var is "+newNode.val);;
			newNode = newNode.next;
		}
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode listNode = new ListNode(-1);
		ListNode cuListNode = listNode;
		while (l1!= null && l2 != null) {
			if (l1.val < l2.val) {
				listNode.next = l1;
				listNode = listNode.next;
				l1 = l1.next;
			} else {
				listNode.next = l2;
				listNode = listNode.next;
				l2 = l2.next;
			}
		}
		if (l1 == null) {
			listNode.next = l2;
        } else {
        	listNode.next = l1;
        }
        return cuListNode.next;
    }
}
