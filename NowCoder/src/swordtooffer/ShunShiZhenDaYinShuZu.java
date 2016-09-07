package swordtooffer;

import java.util.ArrayList;
/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author zhj
 *
 */
public class ShunShiZhenDaYinShuZu {
	   public static void main(String[] args){
		   int[][] arrs = {new int[]{1,2,3,4}, new int[]{5,6,7,8}, new int[]{9,10,11,12}, new int[]{13,14,15,16}};
		   System.out.println(printMatrix(arrs));
	   }
	   public static ArrayList<Integer> printMatrix(int [][] matrix) {
		     if(matrix.length == 0 || matrix[0].length == 0){
		    	 return null;
		     }
		     //采用对角线变换法，注意特殊情况的处理，一行一列的做法。
		     ArrayList<Integer> res = new ArrayList<Integer>();
		     int lux = 0, luy = 0;
		     int rdx = matrix.length - 1, rdy = matrix[0].length - 1;
		     while(lux <= rdx && luy <= rdy){
		    	 if(lux == rdx){
		    		 //一行情况的处理
		    		 int i = luy;
		    		 while(i <= rdy){
		    			 res.add(matrix[lux][i]);
		    			 i++;
		    		 }
		    		 lux++;
				     luy++;
				     rdx--;
				     rdy--;
		    	 }else if(luy == rdy){
		    		 //一列情况的处理
		    		 int i = lux;
		    		 while(i <= rdx){
		    			 res.add(matrix[i][luy]);
		    			 i++;
		    		 }
		    		 lux++;
				     luy++;
				     rdx--;
				     rdy--;
		    	 }else{
		    		 int i = luy;
		    		 while(i < rdy){
			    		 res.add(matrix[lux][i]);
			    		 i++;
			    	 }
			    	 i = lux;
			    	 while(i < rdx){
			    		 res.add(matrix[i][rdy]);
			    		 i++;
			    	 }
			    	 i = rdy;
			    	 while(i > luy){
			    		 res.add(matrix[rdx][i]);
			    		 i--;
			    	 }
			    	 i = rdx;
			    	 while(i > lux){
			    		 res.add(matrix[i][luy]);
			    		 i--;
			    	 }
			    	 lux++;
			    	 luy++;
			    	 rdx--;
			    	 rdy--;
		    	 }
		     }
		     return res;
	    }
}
