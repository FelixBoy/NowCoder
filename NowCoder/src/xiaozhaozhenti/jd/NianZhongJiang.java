package xiaozhaozhenti.jd;
/**
 * С�����ڹ�˾Ҫ�����ս�����С��ǡ�û������߸�����
 * ��Ҫ�ڹ�˾����ϲ���һ���齱��Ϸ����Ϸ��һ��6*6�������Ͻ��У�
 * �������36����ֵ���ȵ����ÿ��С���������������һ�����
 * ����Ҫ�����Ͻǿ�ʼ��Ϸ��ÿ��ֻ�����»��������ƶ�һ�����������½�ֹͣ��
 * һ·�ϵĸ����������С�������õ��������һ���㷨ʹС���õ���ֵ��ߵ����
 * ����һ��6*6�ľ���board������ÿ��Ԫ��Ϊ��Ӧ���ӵ������ֵ,
 * ���Ͻ�Ϊ[0,0],�뷵���ܻ�õ�����ֵ����֤ÿ�������ֵ����100С��1000��
 * 
 * @author zhj
 *
 */
public class NianZhongJiang {
	  /*
	   * ��̬�滮����Ŀ��dp[i][j]��������Ͻǣ�
	   * �����ߵ�i,j����λ���ǣ����ܻ�õ�������ս�.
	   * һά��̬�滮������ȷ��dp[0]��ֵ
	   * ��ά��̬�滮������ȷ����һ�к͵�һ�е�ֵ
	   */
	  public int getMost(int[][] board) {
	        // write code here
		  if(board == null || board.length == 0 || board[0] ==null || board[0].length == 0){
			  return 0;
		  }
		  int[][] dp = new int[board.length][board[0].length];
		  dp[0][0] = board[0][0];
		  for(int i = 1; i < board.length; i++){
			  dp[i][0] = dp[i - 1][0] + board[i][0];
		  }
		  for(int j = 1; j < board[0].length; j++){
			  dp[0][j] = dp[0][j-1] + board[0][j];
		  }
		  for(int i = 1; i < board.length; i++){
			  for(int j = 1; j < board[0].length; j++){
				  dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + board[i][j];
			  }
		  }
		  return dp[board.length - 1][board[0].length - 1];
	  }
}
