package com.leetcode;

import org.junit.Test;

/*
There are two sorted arrays A and B of size m and n respectively. 
Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 */
public class FindMedianSortedArrays {
	@Test
	public void testK()
	{
		int[] A = new int[] {4, 5, 7, 9};
		int[] B = new int[] {2, 3};
		System.out.println(findMedianSortedArrays(A, B));
	}

	public double findMedianSortedArrays(int A[], int B[]) {
		int left = (A.length+B.length+1)/2;
		int right = (A.length+B.length+2)/2;
        return (findKthSortedArrays(A, 0, B, 0, left)+findKthSortedArrays(A, 0, B, 0, right))/2.0;
    }
	/**
	 * 首先将两个数组拆分，分别求出两个数组的第k/2个数
	 * 比较两个数的大小，例如aMin>bMin，则第k个数一定不在B数组的前k/2中
	 * 去掉B数组的前k/2个数，问题变为求解数组A和数组B[k/2+1, B.length]的前k-k/2个数
	 * 递归求解
	 * @param A 数组A
	 * @param astart A的起始下标
	 * @param B
	 * @param bstart
	 * @param k 求第k大的数
	 * @return
	 */
	public static int findKthSortedArrays(int A[], int astart, int B[], int bstart, int k)
	{
		//递归出口
		if(astart>=A.length)
		{
			return B[bstart+k-1];
		}
		if(bstart>=B.length)
		{
			return A[astart+k-1];
		}
		if(k==1)
		{
			return Math.min(A[astart], B[bstart]);
		}
		
		//初始化minA,minB
		//用最大值初始化minA和minB,当某个数组的元素个数太小时，暂时不参与运算
		int minA=Integer.MAX_VALUE, minB=Integer.MAX_VALUE;
		if(astart+k/2-1<A.length)
		{
			minA = A[astart+k/2-1];
		}
		if(bstart+k/2-1<B.length)
		{
			minB = B[bstart+k/2-1];
		}
		//比较两个数的大小
		if(minA > minB)
		{
			return findKthSortedArrays(A, astart, B, bstart+k/2, k-k/2);
		}
		else
		{
			return findKthSortedArrays(A, astart+k/2, B, bstart, k-k/2);
		}
	}
}
