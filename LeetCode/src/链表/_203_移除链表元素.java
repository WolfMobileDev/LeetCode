package 链表;
 /** 
 * @abstract https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @author jinru.lu
 * @version Apr 27, 2019 9:40:16 PM
 */
public class _203_移除链表元素 {
	
//	输入: 1->2->6->3->4->5->6, val = 6
//  输出: 1->2->3->4->5
	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		
		node1.next = node2;
		node2.next = node3;
		
		_203_移除链表元素 node = new _203_移除链表元素();
		System.out.println(node.removeElements(node1, 1).val);
	}
	
	public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(-1);
        header.next = head;
        ListNode cur = header;
        while(cur.next != null){
            if(cur.next.val == val ){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return header.next;
    }
}
