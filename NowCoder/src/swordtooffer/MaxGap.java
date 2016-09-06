package swordtooffer;

/**
 * 题目描述

给定一个长度为N(N>1)的整型数组A，可以将A划分成左右两个部分，
左部分A[0..K]，右部分A[K+1..N-1]，
K可以取值的范围是[0,N-2]。求这么多划分方案中，
左部分中的最大值减去右部分最大值的绝对值，最大是多少？
给定整数数组A和数组的大小n，请返回题目所求的答案。
测试样例：
[2,7,3,1,1],5
返回：6
 * @author zhj
 *
 */
public class MaxGap {
	public int findMaxGap(int[] A, int n) {
		// write code here
		if (A == null || A.length != n) {
			return -1;
		}
		// 记录最终结果的变量
		int maxDiffAbs = Integer.MIN_VALUE;
		for (int k = 0; k <= n - 2; k++) {
			int maxLeft = getMaxValue(A, 0, k);
			int maxRight = getMaxValue(A, k + 1, n - 1);
			if ((int) Math.abs(maxLeft - maxRight) > maxDiffAbs) {
				maxDiffAbs = (int) Math.abs(maxLeft - maxRight);
			}
		}
		return maxDiffAbs;
	}

	// 求数组中，指定片段的最大值
	public int getMaxValue(int[] A, int i, int j) {
		int maxValue = A[i];
		for (int k = i + 1; k <= j; k++) {
			if (A[k] > maxValue) {
				maxValue = A[k];
			}
		}
		return maxValue;
	}
}
