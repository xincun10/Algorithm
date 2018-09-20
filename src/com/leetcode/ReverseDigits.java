package com.leetcode;
/*
Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321

click to show spoilers.

Have you thought about this?
Here are some good questions to ask before coding. 
Bonus points for you if you have already thought through this!

If the integer's last digit is 0, what should the output be? 
ie, cases such as 10, 100.

Did you notice that the reversed integer might overflow? 
Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. 
How should you handle such cases?

Throw an exception? 
Good, but what if throwing an exception is not an option? 
You would then have to re-design the function (ie, add an extra parameter).
 */
public class ReverseDigits {

	public int reverse(int x) {
		int res = 0;
        while(x!=0)
        {
        	int tail = x%10;
        	long newRes = res*10 + tail;
        	if(isOverflow(newRes))
        	{
        		//溢出
        		return 0;
        	}
        	res = (int) newRes;
        	x = x/10;
        }
        return res;
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
