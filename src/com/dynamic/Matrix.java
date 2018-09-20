package com.dynamic;
/**
 * ����n�������A1,A2,��,An��������Ai��Ai+1�ǿɳ˵ģ�i=1,2 ,��,n-1��
 * ���ȷ������������˻��ļ������ʹ�����˴������������˻���Ҫ�����˴������١�
 * @author Administrator
 *
 */
public class Matrix {
	/**
	 * @param arr ��������
	 * @param num ����ĸ��������鳤��-1
	 * @return ��С���˴���
	 */
	public static int matrix_chain(int[] arr, int num)
	{
		//�洢��С���˴���
		int[][] times = new int[num][num];
		//�洢��С���˴����ĶϿ���
		int[][] points = new int[num][num];
		
		int i,j,r,k;
	    
	    for (i = 0; i < num; i++)   //��һ�������С�˴ζ���Ϊ0
	    {
	        times[i][i] = 0;
	    }
	    
	    for (r = 2; r <= num; r++)  //rΪ���˾���ĸ���
	    {
	        for (i = 0; i <= num-r; i++)   //i��ʾ���˾����еĵ�һ��
	        {
	            j = i + r -1;         //j��ʾ���˾����е����һ��
	            times[i][j] = 99999;
	            for (k = i; k <= j-1; k++)  //�ڵ�һ�������һ��֮��Ѱ������ʵĶϿ��㣬ע�⣬���Ǵ�i��ʼ����Ҫ�ȼ�����������������˵ĳ˴�
	            {
	                int tmp = times[i][k] + times[k+1][j] + arr[i]*arr[k+1]*arr[j+1];
	                if (tmp < times[i][j])
	                {
	                	times[i][j] = tmp;
	                    points[i][j] = k;
	                }
	            }
	        }
	    }
	    return times[0][num-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {30, 35, 15, 5, 10, 20, 25};
		int times = matrix_chain(array, array.length-1);
		System.out.println(times);
	}

}
