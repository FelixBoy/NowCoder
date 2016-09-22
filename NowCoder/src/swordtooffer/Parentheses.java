package swordtooffer;

import java.util.Stack;
/**
 * �ٶ����߱�����⣬�ж������ַ����Ƿ�Ϊƽ���ַ������Լ�ͳ��ƽ���ַ�������
 * @author zhj
 *
 */
public class Parentheses
{
	public static void main(String[] args) {
		System.out.print(balancedParentheses("(())((()))("));
	}
  // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
  public static int balancedParentheses(String str)
  {
    // INSERT YOUR CODE HERE
	  Stack<Character> stack = new Stack<Character>();
	  int i = 0;
	  int count = 0;
	  for( ;i < str.length(); i++){
		  Character c = str.charAt(i);
		  if(c == '('){
			  stack.push(c);
		  }else{
			  if(!stack.isEmpty()){
				  stack.pop();
				  count++;
			  }else{
				  break;
			  }
		  }
	  }
	  if(i == str.length() && stack.isEmpty()){
		  return count;
	  }else{
		  return -1;
	  }
  }
  // METHOD SIGNATURE ENDS
}
