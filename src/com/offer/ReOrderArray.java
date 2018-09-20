package com.offer;
/*
 * 调整数组顺序使奇数位于偶数前面
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */
public class ReOrderArray {
	/*
	 * 调整每两个数的位置，只要偶数在奇数前面，就交换。
	 */
	public void reOrderArray(int [] array) {
		for(int j=0; j<array.length-1; j++)
		{
			//完成一次交换
			for(int i=0; i<array.length-1; i++)
	        {
	    		if(array[i]%2==0 && array[i+1]%2!=0)
	    		{
	    			int tmp = array[i];
	    			array[i] = array[i+1];
	    			array[i+1] = tmp;
	    		}
	        }
		}
    }
}
