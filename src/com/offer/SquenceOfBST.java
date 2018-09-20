package com.offer;
/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @author Administrator
 *
 */
public class SquenceOfBST {
	
	public boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence.length == 0)
			return false;
		return VerifySquenceOfBST(sequence, 0, sequence.length);
    }

	public boolean VerifySquenceOfBST(int [] sequence, int start, int end) {
		
		if(end == start + 1)
		{
			return true;
		}
		if(end == start)
		{
			return true;
		}
		if(end == start + 2)
		{
			if(sequence[start] > sequence[end-1])
			{
				return false;
			}
			return true;
		}
		if(end == start + 3)
		{
			if(sequence[start+1] >= sequence[start] && sequence[start+1] <= sequence[end-1])
			{
				return true;
			}
			return false;
		}
		
		int root = sequence[end-1];
		int index = end;
		for(int i=start; i<end; i++)
		{
			if(sequence[i] > root)
			{
				index = i;
			}
		}
		index = (index==end)?(index-1):index;
		return (VerifySquenceOfBST(sequence, start, index) &&
				VerifySquenceOfBST(sequence, index, end-1));
    }
}
