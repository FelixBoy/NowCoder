package swordtooffer;

import java.util.Stack;
//����ջ�����ݽṹ�����ڸ�������ʵ��һ��
//�ܹ��õ�ջ��СԪ�ص�min������
public class GetMinStack {
	public static void main(String[] args) {
		
	}
	private int top = 0;
    private Stack<Integer> stack = new Stack<Integer>();
    private int min = Integer.MAX_VALUE;
    public void push(int node) {
        stack.push(node);
        if(node < min){
        	min = node;
        }
        top++;
    }
    
    public void pop() {
    	int popValue = stack.pop();
    	top--;
    	if(top == 0){
    		min = Integer.MAX_VALUE;
    	}else{
    		if(popValue == min){
    			min = getMin();
        	}
    	}
    }
    private int getMin(){
    	min = stack.get(0);
    	for(int i = 1; i < top; i++){
    		if(stack.get(i) < min){
    			min = stack.get(i);
    		}
    	}
    	return min;
    }
    public int top() {
       return stack.peek();
    }
    
    public int min() {
        return min;
    }
}
