package swordtooffer;
/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 * @author zhj
 *
 */
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class MergeSortedList {
	public ListNode Merge(ListNode list1,ListNode list2) {
		//判断函数入参合法性
		if(list1 == null && list2 == null){
			return null;
		}
		if(list1 == null && list2 != null){
			return list2;
		}
		if(list1 != null && list2 == null){
			return list1;
		}
		//调整list1和list2 总让list1指向小的头结点的指针
		if(list1.val > list2.val){
			ListNode temp = list2;
			list2 = list1;
			list1 = temp;
		}
		//声明合成后节点的头指针，应该指向首节点元素小的头结点
		ListNode list = list1;
		//list1 和 list2的 记忆指针p、q。p总指向首节点元素小的那个
		ListNode p = list1;
		ListNode q = list2;
		
		while(list1 != null){
			if(list2.val < list1.val){
				q = list2.next;
				list2.next = list1;
				p.next = list2;
				p = list2;
				list2 = q;
				if(list2 == null){
					break;
				}
			}else{
				p = list1;
				list1 = list1.next;
			}
		}
		if(list2 != null){
			p.next = list2;
		}
        return list;
    }
}
