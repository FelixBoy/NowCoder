package xiaozhaozhenti.jd;
/**
 * 小东所在公司要发年终奖，而小东恰好获得了最高福利，
 * 他要在公司年会上参与一个抽奖游戏，游戏在一个6*6的棋盘上进行，
 * 上面放着36个价值不等的礼物，每个小的棋盘上面放置着一个礼物，
 * 他需要从左上角开始游戏，每次只能向下或者向右移动一步，到达右下角停止，
 * 一路上的格子里的礼物小东都能拿到，请设计一个算法使小东拿到价值最高的礼物。
 * 给定一个6*6的矩阵board，其中每个元素为对应格子的礼物价值,
 * 左上角为[0,0],请返回能获得的最大价值，保证每个礼物价值大于100小于1000。
 * 
 * @author zhj
 *
 */
public class NianZhongJiang {
	  /*
	   * 动态规划类题目，dp[i][j]代表从左上角，
	   * 依次走到i,j所在位置是，所能获得的最高年终奖.
	   * 一维动态规划表，首先确定dp[0]的值
	   * 二维动态规划表，首先确定第一列和第一行的值
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
