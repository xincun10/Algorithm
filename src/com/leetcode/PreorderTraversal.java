package com.leetcode;

import java.util.ArrayList;
import java.util.Stack;

import org.junit.Test;

/*
 * Given a binary tree, return the preorder traversal of its nodes' values.

For example:
Given binary tree{1,#,2,3},

   1
    \
     2
    /
   3

return[1,2,3].
Recursive solution is trivial, could you do it iteratively?
不用递归
 */
public class PreorderTraversal {
	@Test
	public void test()
	{
		preorderTraversal(new TreeNode(0));
	}

	//前序遍历
	//利用栈实现	
	//先将根节点压进去，再压右子节点
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<>();
		if(root == null)
		{
			return list;
		}
		stack.push(root);
		while(!stack.isEmpty())
		{
			TreeNode node = stack.pop();
			list.add(node.val);
			if(node.right!=null) stack.push(node.right);
			if(node.left!=null) stack.push(node.left);
		}
		return list;
    }
	
}
