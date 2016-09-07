package swordtooffer;

import java.util.ArrayList;
/**
 * ����һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣�
 * ���磬����������¾��� 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
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
		     //���öԽ��߱任����ע����������Ĵ���һ��һ�е�������
		     ArrayList<Integer> res = new ArrayList<Integer>();
		     int lux = 0, luy = 0;
		     int rdx = matrix.length - 1, rdy = matrix[0].length - 1;
		     while(lux <= rdx && luy <= rdy){
		    	 if(lux == rdx){
		    		 //һ������Ĵ���
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
		    		 //һ������Ĵ���
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
