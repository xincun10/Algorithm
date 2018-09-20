package com.leetcode;

import org.junit.Test;

/*
 * 将字符串改写为整形
 * 忽略非数字和空格
 * 考虑溢出，溢出直接输出
 */
public class MyAtoI {
	
	@Test
	public void test()
	{
		String str = "2147483648";
		System.out.println(atoi(str));
//		long newRes = 2147483648l;
//		System.out.println(newRes);
	}
	/*
     * 该题需要考虑的几个关键点：
     * 1.正负号；
     * 2.中间存在字母（只取字母前的数字）;
     * 3.溢出;
     * 4.前后空格
     * Integer.Min_VALUE=-2147483648 . Integer.MAX_VALUE=2147483647
     */
	public int atoi(String str) {
		if(str==null || str.trim().length()==0)
		{
			return 0;
		}
		char[] nums = str.trim().toCharArray();
		//正负数判断
		int sign = 1;
		int index = 0;
		if(nums[0]=='-')
		{
			sign = -1;
			index++;
		}
		if(nums[0]=='+')
		{
			index++;
		}
		
		int res = 0;
		for(int i=index; i<nums.length; i++)
		{
			//非数字直接进入结束循环
			if(nums[i]-'0'<0 || nums[i]-'9'>0)
			{
				break;
			}
			//这里一定要加l表示long型，不然会报错
			long newRes = res*10l + (nums[i]-'0');
			//判断是否溢出
			if(isOverflow(newRes))
			{
				if(sign>0)
					return Integer.MAX_VALUE;
				else
					return Integer.MIN_VALUE;
			}
			res = (int) newRes;
		}
		return res*sign;
	}
	
	/*
	 * 判断是否溢出
	 * Java整形的范围是2^31-1到-2^31
	 */
	public boolean isOverflow(long x){
		if((x>0 && x>0x7fffffff) || (x<0 && x<0x80000000))
		{
			return true;
		}
		return false;
	}

}
