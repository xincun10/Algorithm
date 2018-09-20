package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/*
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the 
shortest path from the root node down to the nearest leaf node.
一定是根节点到叶结点的最小深度。
 */
public class MiniDepth {

	/**
	 * 递归解法，使用深度优先遍历，求出最小深度。
	 * 注意，当根的子节点为空时的情况。
	 * @param root
	 * @return
	 */
	public int run(TreeNode root) {
		if(root == null)
			return 0;
		if(root.left==null)
		{
			return run(root.right)+1;
		}
		if(root.right==null)
		{
			return run(root.left)+1;
		}
		return Math.min(run(root.left), run(root.right))+1;
    }
	
	/*
	 * 解法二：使用层序遍历，遇到第一个叶结点的深度即为所求
	 */
	public int run2(TreeNode root)
	{
		int res = 0;
		Queue<TreeNode> queue = new LinkedList<>();
		if(root!=null)
		{
			queue.add(root);
		}
		while(!queue.isEmpty())
		{
			//len存储每层结点个数
			int len = queue.size();
			res++;
			//每轮循环处理一层，保证res里面存储的是层数
			for(int i=0; i<len; i++)
			{
				TreeNode node = queue.poll();
				if(node.left!=null) queue.add(node.left);
				if(node.right!=null) queue.add(node.right);
				if(node.left==null && node.right==null) 
					return res;
			}
		}
		return res;
	}
}
