package 链表;

/** 
* @abstract https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
* @author jinru.lu
* @version Apr 27, 2019 12:07:19 PM
*/
public class _237_删除链表中的节点 {
	
	public static void main(String[] args) {
		
	}
	
	public void deleteNode(ListNode node) {
		if (node == null) {
			return;
		}
        node.val = node.next.val;
        node.next = node.next.next; 
    }
}
