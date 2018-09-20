package com.zcy;

import java.util.Scanner;

/*
 * �������ַ���֮�����̱༭����
 */
public class GetLD {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			//��ת�õ����ַ��������ת��Ϊ��������ַ�������
			String str1 = in.nextLine();
			String str2 = in.nextLine();
			int lens[][] = getLD(str1, str2);
			int leng1 = str1.length();
			int leng2 = str2.length();
			System.out.println(lens[leng1][leng2]);
		}
	}

	public static int[][] getLD(String str1, String str2)
	{
		int leng1 = str1.length();
		int leng2 = str2.length();
		int[][] lens = new int[leng1+1][leng2+1];
		//���ȳ�ʼ������ĵ�һ�к͵�һ��
		for(int i=0; i<=leng1; i++)
		{
			lens[i][0] = i;
		}
		for(int i=0; i<=leng2; i++)
		{
			lens[0][i] = i;
		}
		//������������λ�õĴ�С
		for(int i=1; i<=leng1; i++)
		{
			for(int j=1; j<=leng2; j++)
			{
				if(str1.charAt(i-1) == str2.charAt(j-1))
				{
					lens[i][j] = lens[i-1][j-1];
				}
				else
				{
					int tmp = Math.min(lens[i][j-1], lens[i-1][j]);
					lens[i][j] = Math.min(tmp, lens[i-1][j-1]) + 1;
				}
			}
		}
		return lens;
	}
}
