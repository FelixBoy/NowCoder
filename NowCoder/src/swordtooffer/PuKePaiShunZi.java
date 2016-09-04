package swordtooffer;

import java.util.Arrays;

/**
 * LL今天心情特别好,因为他去买了一副扑克牌,
 * 发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,
 * 如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....
 * LL不高兴了,他想了想,决定大\小 王可以看成任何数字,
 * 并且A看作1,J为11,Q为12,K为13。
 * 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),
 * “So Lucky!”。LL决定去买体育彩票啦。 
 * 现在,要求你使用这幅牌模拟上面的过程,
 * 然后告诉我们LL的运气如何。为了方便起见,
 * 你可以认为大小王是0。
 * @author zhj
 *
 */
public class PuKePaiShunZi {
	  public boolean isContinuous(int [] numbers) {
		  //整体思路，将大小王看成任意牌面的情况下，五张牌能否连续
		  //排序，求王的个数。
		  //看王的个数，是否能弥补，剩下牌面之间的差值。
		  if(numbers == null || numbers.length == 0){
			  return false;
		  }
		  //先排序
		  Arrays.sort(numbers);
		  int kingCount = 0;
		  int i = 0;
		  //统计王的个数
		  for(;i < numbers.length; i++){
			  if(numbers[i] == 0){
				  kingCount++;
			  }else{
				  break;
			  }
		  }
		  //统计非王的牌之间的差值和。
		  int difLen = 0;
		  while(i < numbers.length - 1){
              int dif = numbers[i + 1] - numbers[i];
              //如果出现非王的牌，相等，则肯定不能组成顺子
              if(dif == 0){
                  return false;
              }else{
                  difLen = difLen + dif - 1;
              }
			i++;
		  }
		  //看看王的数量，够不够填差值的坑
		  if(kingCount >= difLen){
			  return true;
		  }else{
			  return false;
		  }
	  }
}
