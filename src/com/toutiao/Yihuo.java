package com.toutiao;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * 给定整数m以及n各数字A1,A2,..An，将数列A中所有元素两两异或，共能得到n(n-1)/2个结果，请求出这些结果中大于m的有多少个。
 * 3 10  
 * 6 5 10
 * 
 * 使用trie树,做不出来
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
				//添加到Trie树
				buildTrie(root, letters[i]);
			}
			//高位补零
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
						//异或的数字不同，结果一定为1
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
	
	//将数字改为32位二进制字符串
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
