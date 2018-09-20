package com.leetcode;

import org.junit.Test;

/*
The string"PAYPALISHIRING"is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
P   A   H   N
A P L S I I G
Y   I   R
And then read line by line:"PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3)should return"PAHNAPLSIIGYIR".
n=2时，字符串坐标变成zigzag的走法就是：
 0 2 4 6

 1 3 5 7
n=3时的走法是：

 0   4   8

 1 3 5 7 9

 2   6   10 

 n=4时的走法是：

 0    6      12

 1  5 7   11 13

 2 4  8 10   14

 3    9      15 
 第一行和最后一行的数字下标之差都是2n-2
如果不是第一行和第四行，则第i行的下标之差为2n-2i-2和2i
注意考虑nRows=1时的情况要单独处理，否则会出现堆溢出的错误
 */
public class Convert {
	@Test
	public void testStr()
	{
		String s = "PAYPALISHIRING";
		System.out.println(convert(s, 1));
	}

	public String convert(String s, int nRows) {
		if(nRows == 1)
		{
			return s;
		}
		StringBuilder res = new StringBuilder();
        for(int i=0; i<nRows; i++)
        {
        	for(int j=i; j<s.length();)
    		{
    			res.append(s.charAt(j));
    			if(i==0 || i==nRows-1)
    				j += 2*nRows-2;
    			else
    			{
    				j += 2*nRows-2*i-2;
    				if(j<s.length())
        			{
        				res.append(s.charAt(j));
        				j += 2*i;
        			}
    			}
    		}
        }
        return res.toString();
    }
}
