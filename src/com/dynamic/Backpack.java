package com.dynamic;
/**
 * �б�ŷֱ�Ϊa,b,c,d,e�������Ʒ�����ǵ������ֱ���2,2,6,5,4��
 * ���ǵļ�ֵ�ֱ���6,3,5,4,6�����ڸ��������Ϊ10�ı���������ñ�����װ�����Ʒ�������ļ�ֵ�ܺͣ�
 * @author Administrator
 *
 */
public class Backpack {

	/**
	 * 0-1��������
	 * ����Ĺؼ��Ƕ���ÿһ����Ʒ����ֻ�зŽ�ȥ�Ͳ��Ž�ȥ����ѡ��
	 * @param weight ��Ʒ������
	 * @param value ��Ʒ�ļ�ֵ
	 * @param num ��Ʒ����
	 * @param capacity ��������
	 * @return ����ֵ
	 */
	public static int ZeroOneBackpack(int[] weight, int[] value, int num, int capacity)
	{
		//mp[i][j]��ʾ��ѡ��ƷΪǰi��������Ϊjʱ������ֵ
		int[][] mp = new int[num+1][capacity+1];
		//��ѡ��ƷΪ0������Ϊ0ʱ������ֵ��Ϊ0
		for(int i=0; i<capacity+1; i++)
		{
			mp[0][i] = 0;
		}
		for(int i=0; i<num+1; i++)
		{
			mp[i][0] = 0;
		}
		
		for(int i=1; i<num+1; i++)
		{
			for(int j=1; j<capacity+1; j++)
			{
				if(weight[i-1] > j)//��Ʒi��������������
				{
					//��Ʒi�Ų���ȥ������ֵ��ǰi-1����Ʒ������ֵ
					mp[i][j] = mp[i-1][j];
				}
				else
				{
					//i���ԷŽ�ȥ
					//�Ƚϰ�i�Ž�ȥ�Ͳ��Ž�ȥ������ֵ
					mp[i][j] = Math.max(value[i-1]+mp[i-1][j-weight[i-1]], mp[i-1][j]);
				}
			}
		}
		return mp[num][capacity];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weight = {2, 2, 6, 5, 4};
		int[] value = {6, 3, 5, 4, 6};
		int max_value = ZeroOneBackpack(weight, value, weight.length, 10);
		System.out.println(max_value);
	}

}
