package com.offer;
/*
 * ��������˳��ʹ����λ��ż��ǰ��
 * ����һ���������飬ʵ��һ�����������������������ֵ�˳��
 * ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò���
 */
public class ReOrderArray {
	/*
	 * ����ÿ��������λ�ã�ֻҪż��������ǰ�棬�ͽ�����
	 */
	public void reOrderArray(int [] array) {
		for(int j=0; j<array.length-1; j++)
		{
			//���һ�ν���
			for(int i=0; i<array.length-1; i++)
	        {
	    		if(array[i]%2==0 && array[i+1]%2!=0)
	    		{
	    			int tmp = array[i];
	    			array[i] = array[i+1];
	    			array[i+1] = tmp;
	    		}
	        }
		}
    }
}
