package swordtooffer;

import java.util.ArrayList;
import java.util.Stack;

public class PrintLinkedListFromRear {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<Integer>();
        ListNode p = listNode;
        while(p != null){
        	stack.push(p.val);
        	p = p.next;
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        while(!stack.isEmpty()){
        	res.add(stack.pop());
        }
        return res;
	}
}
