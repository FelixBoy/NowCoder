package swordtooffer;

import java.util.Arrays;

/**
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,
 * ���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 * ��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,
 * ����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 * ������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....
 * LL��������,��������,������\С �����Կ����κ�����,
 * ����A����1,JΪ11,QΪ12,KΪ13��
 * �����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),
 * ��So Lucky!����LL����ȥ��������Ʊ���� 
 * ����,Ҫ����ʹ�������ģ������Ĺ���,
 * Ȼ���������LL��������Ρ�Ϊ�˷������,
 * �������Ϊ��С����0��
 * @author zhj
 *
 */
public class PuKePaiShunZi {
	  public boolean isContinuous(int [] numbers) {
		  //����˼·������С�������������������£��������ܷ�����
		  //���������ĸ�����
		  //�����ĸ������Ƿ����ֲ���ʣ������֮��Ĳ�ֵ��
		  if(numbers == null || numbers.length == 0){
			  return false;
		  }
		  //������
		  Arrays.sort(numbers);
		  int kingCount = 0;
		  int i = 0;
		  //ͳ�����ĸ���
		  for(;i < numbers.length; i++){
			  if(numbers[i] == 0){
				  kingCount++;
			  }else{
				  break;
			  }
		  }
		  //ͳ�Ʒ�������֮��Ĳ�ֵ�͡�
		  int difLen = 0;
		  while(i < numbers.length - 1){
              int dif = numbers[i + 1] - numbers[i];
              //������ַ������ƣ���ȣ���϶��������˳��
              if(dif == 0){
                  return false;
              }else{
                  difLen = difLen + dif - 1;
              }
			i++;
		  }
		  //�����������������������ֵ�Ŀ�
		  if(kingCount >= difLen){
			  return true;
		  }else{
			  return false;
		  }
	  }
}
