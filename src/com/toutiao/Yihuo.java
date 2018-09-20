package com.toutiao;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * ��������m�Լ�n������A1,A2,..An��������A������Ԫ��������򣬹��ܵõ�n(n-1)/2��������������Щ����д���m���ж��ٸ���
 * 3 10  
 * 6 5 10
 * 
 * ʹ��trie��,��������
 */
public class Yihuo {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		TrieNode root = new TrieNode();
		while(scan.hasNext())
		{
			int num = scan.nextInt();
			int m = scan.nextInt();
			char[][] letters = new char[num][];
			int[] arr = new int[num];
			int count = 0;
			for(int i=0; i<num; i++)
			{
				arr[i] = scan.nextInt();
				letters[i] = binaryToDecimal(arr[i]).toCharArray();
				//��ӵ�Trie��
				buildTrie(root, letters[i]);
			}
			//��λ����
			char[] marr = binaryToDecimal(m).toCharArray();
			System.out.println(marr);
			for(int i=0; i<num; i++)
			{
				TrieNode node = root;
				for(int j=0; j<32; j++)
				{
					int pos = letters[i][j] - '0';
					if(node.son[pos]!=null)
					{
						//�������ֲ�ͬ�����һ��Ϊ1
						if(marr[j]=='1')
							continue;
						else
						{
							count++;
							break;
						}
					}
					node = node.son[pos];
				}
			}
		}
	}
	
	//�����ָ�Ϊ32λ�������ַ���
	public static String binaryToDecimal(int n){
		StringBuffer result = new StringBuffer();
		for(int i = 31;i >= 0; i--)
			result.append((n >>> i & 1));
		return result.toString();
	}
	
	public static void buildTrie(TrieNode root, char[] letters)
	{
		TrieNode node = root;
		for(int i=0; i<letters.length; i++)
		{
			int pos = letters[i] - '0';
			if(node.son[pos] == null)
			{
				node.son[pos] = new TrieNode();
				node.son[pos].val = letters[i];
			}
			else
			{
				node.son[pos].num++;
			}
			node = node.son[pos];
		}
	}

	public static void baoli() {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int num = scan.nextInt();
			int m = scan.nextInt();
			int[] arr = new int[num];
			int count = 0;
			for(int i=0; i<num; i++)
			{
				arr[i] = scan.nextInt();
			}
			for(int i=0; i<num; i++)
			{
				for(int j=i+1; j<num; j++)
				{
					int tmp = arr[i] ^ arr[j];
					if(tmp >= m)
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
class TrieNode
{
	public static final int SIZE = 2;
	public int num;
	public TrieNode son[];
	public int val;
	
	public TrieNode()
	{
		num = 1;
		son = new TrieNode[SIZE];
	}
}
