package swordtooffer;
/**
 * ���������������������������������ϳɺ������
 * ��Ȼ������Ҫ�ϳɺ���������㵥����������
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
		//�жϺ�����κϷ���
		if(list1 == null && list2 == null){
			return null;
		}
		if(list1 == null && list2 != null){
			return list2;
		}
		if(list1 != null && list2 == null){
			return list1;
		}
		//����list1��list2 ����list1ָ��С��ͷ����ָ��
		if(list1.val > list2.val){
			ListNode temp = list2;
			list2 = list1;
			list1 = temp;
		}
		//�����ϳɺ�ڵ��ͷָ�룬Ӧ��ָ���׽ڵ�Ԫ��С��ͷ���
		ListNode list = list1;
		//list1 �� list2�� ����ָ��p��q��p��ָ���׽ڵ�Ԫ��С���Ǹ�
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
