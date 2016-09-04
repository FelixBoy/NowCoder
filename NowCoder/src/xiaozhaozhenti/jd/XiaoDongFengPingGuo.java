package xiaozhaozhenti.jd;
/** 小东分苹果
 * 果园里有一堆苹果，一共n头(n大于1小于9)熊来分，第一头为小东，它把苹果均分n份后，多出了一个，它扔掉了这一个，拿走了自己的一份苹果，接着第二头熊重复这一过程，即先均分n份，扔掉一个然后拿走一份，以此类推直到最后一头熊都是这样(最后一头熊扔掉后可以拿走0个，也算是n份均分)。问最初这堆苹果最少有多少个。
给定一个整数n,表示熊的个数，返回最初的苹果数。保证有解。
测试样例：2
返回：3
 * @author zhj
 *
 */
public class XiaoDongFengPingGuo {
	 public static void main(String[] args){
		 System.out.println(getInitial(3));
	 }
	 public static int getInitial(int n) {
	        // write code here
	       for(int i = n+1; ; i++){
	            int temp = i;
	            int bear = n;
	            while(bear > 0){
	                if(temp%n == 1){
	                    temp  =  temp - temp/n - 1;
	                    bear--;
	                }else{
	                    break;
	                }
	            }
	            if(bear == 0){
	                return i;
	            }
	        }
	 }
}
