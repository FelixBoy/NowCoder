package xiaozhaozhenti.jd;
/**
 * С������������һ����¥����С������վ��¥���Ĳ�ͬ�㣬
 * ����С��վ��¥��������N�ף�����������������£�
 * ÿ����غ������ϴ�����߶ȵ�һ�룬���Դ�����֪��ȫ���䵽���治����
 * ��4��С��һ�������˶����ף�(���ֶ�Ϊ����)
	�����ĸ�����A,B,C,D���뷵����������
	����������100,90,80,70
	���أ�1020
 * @author zhj
 *
 */
public class PaoXiaoQiu {
	public static void main(String[] args) {
		System.out.println(paoXiaoQiu(100,90,80,70));
	}
	public static int paoXiaoQiu(int A, int B, int C, int D){
		return getHeight(A) + getHeight(B) + getHeight(C) + getHeight(D);
	}
	public static int getHeight(int h){
		double sum = 0;
		double d_h = h;
		while(d_h > 0){
			//����֮��ģ������ĸ߶�ҲҪ��Ϊ�����ľ���
			sum = sum + d_h + d_h/2;
			d_h = d_h/2;
		}
		return (int)Math.ceil(sum);
	}
}
