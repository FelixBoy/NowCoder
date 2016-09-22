package swordtooffer;

import java.util.Stack;
/**
 * 百度在线编程真题，判断括号字符串是否为平衡字符串，以及统计平衡字符串个数
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
