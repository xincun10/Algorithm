package com.zcy.digui;

public class Xunhuan {
	
	public static void main(String[] args) {
		System.out.println(isSameString("abcd", "abca"));
	}
	
	/**
	 * 一个方法要调用自身，为了避免死循环，条件一定要有变化
	 * 变化反映在参数。
	 * 函数要有出口，否则会造成栈溢出
	 * 如果出现了栈溢出的错误，一定是递归的出口有问题。
	 * @param n
	 */
	private static void f(int n)
	{
		//自身要做一些工作
		System.out.println(n);
		//函数出口
		if(n>0)
		{
			//调用自身
			f(n-1);
		}		
	}
	
	/**
	 * 打印从0到n
	 */
	public static void f2(int begin, int end)
	{
		//函数出口
		if(begin > end)
			return;
		System.out.println(begin);
		f2(begin+1, end);
	}
	/**
	 * 计算数组之和
	 * @param a
	 * @param start
	 * @return
	 */
	public static int f(int[] a, int start)
	{
		//出口
		if(start == a.length) return 0;
		//递归本质是踢皮球
		//本身计算自身加上下面计算得出的和
		return f(a, start+1) + a[start];
	}
	/**
	 * 比较两个串是否相同
	 * @param s1
	 * @param s2
	 * @param n
	 * @return
	 */
	public static boolean isSameString(String s1, String s2)
	{
		if(s1.length()!=s2.length()) return false;
		if(s1.length() == 0) return true;
		//先比较自身，不等直接返回false
		if(s1.charAt(0) != s2.charAt(0)) return false;
		//交给下级
		return isSameString(s1.substring(1), s2.substring(1));
	}

}
