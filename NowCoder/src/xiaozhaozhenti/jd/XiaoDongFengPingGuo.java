package xiaozhaozhenti.jd;
/** С����ƻ��
 * ��԰����һ��ƻ����һ��nͷ(n����1С��9)�����֣���һͷΪС��������ƻ������n�ݺ󣬶����һ�������ӵ�����һ�����������Լ���һ��ƻ�������ŵڶ�ͷ���ظ���һ���̣����Ⱦ���n�ݣ��ӵ�һ��Ȼ������һ�ݣ��Դ�����ֱ�����һͷ�ܶ�������(���һͷ���ӵ����������0����Ҳ����n�ݾ���)����������ƻ�������ж��ٸ���
����һ������n,��ʾ�ܵĸ��������������ƻ��������֤�н⡣
����������2
���أ�3
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
	                if(temp%bear == 1){
	                    temp = temp - temp/n - 1;
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
