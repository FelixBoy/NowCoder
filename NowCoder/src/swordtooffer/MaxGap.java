package swordtooffer;

/**
 * ��Ŀ����

����һ������ΪN(N>1)����������A�����Խ�A���ֳ������������֣�
�󲿷�A[0..K]���Ҳ���A[K+1..N-1]��
K����ȡֵ�ķ�Χ��[0,N-2]������ô�໮�ַ����У�
�󲿷��е����ֵ��ȥ�Ҳ������ֵ�ľ���ֵ������Ƕ��٣�
������������A������Ĵ�Сn���뷵����Ŀ����Ĵ𰸡�
����������
[2,7,3,1,1],5
���أ�6
 * @author zhj
 *
 */
public class MaxGap {
	public int findMaxGap(int[] A, int n) {
		// write code here
		if (A == null || A.length != n) {
			return -1;
		}
		// ��¼���ս���ı���
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

	// �������У�ָ��Ƭ�ε����ֵ
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
