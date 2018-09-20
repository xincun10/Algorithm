package com.leetcode;
/*
 * Determine whether an integer is a palindrome. Do this without extra space.
Some hints:
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.
 */
public class PalindromeNumber {
	
	public boolean isPalindrome(int x)
	{
		//负数或者10的倍数一定不是回文数
		if(x<0 || (x!=0 && x%10==0))
		{
			return false;
		}
		//reverse为反转后的数字
		int reverse = 0;
		while(x > reverse)
		{
			reverse = reverse*10 + x%10;
			x = x/10;
		}
		return (x==reverse || reverse/10==x);
	}

}
