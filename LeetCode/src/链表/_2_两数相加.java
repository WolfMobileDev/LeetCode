package 链表;
 /** 
 * @abstract https://leetcode-cn.com/problems/add-two-numbers/
 * @author jinru.lu
 * @version 2019年5月16日 上午12:17:52
 */
public class _2_两数相加 {
	
//	输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
//	输出：7 -> 0 -> 8
	
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(2);
		ListNode listNode2 = new ListNode(4);
		ListNode listNode3 = new ListNode(3);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		
		ListNode listNode4 = new ListNode(5);
		ListNode listNode5 = new ListNode(6);
		ListNode listNode6 = new ListNode(3);
		listNode4.next = listNode5;
		listNode5.next = listNode6;
		
		_2_两数相加 node = new _2_两数相加();
		ListNode newNode = node.addTwoNumbers(listNode1, listNode4);
		while (newNode != null) {
			System.out.println("newNode.var is "+newNode.val);;
			newNode = newNode.next;
		}
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 ListNode dummy = new ListNode(-1);
	     ListNode cur = dummy;
	     int carry = 0;
	     while (l1 != null || l2 != null) {
	          int d1 = l1 == null ? 0 : l1.val;
	          int d2 = l2 == null ? 0 : l2.val;
	          int sum = d1 + d2 + carry;
	          carry = sum >= 10 ? 1 : 0;
	          System.out.println("d1 is " + d1 + " d2 is " + d2 + " sum is " + sum + " carry is " + carry);
	          cur.next = new ListNode(sum % 10);
	          cur = cur.next;
	          if (l1 != null) l1 = l1.next;
	          if (l2 != null) l2 = l2.next;
	     }
	     
	     if (carry == 1) cur.next = new ListNode(1);
	     return dummy.next;
    }
}
