package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * Given a binary tree, return the postorder traversal of its nodes' values.

For example:
Given binary tree{1,#,2,3},

   1
    \
     2
    /
   3

return[3,2,1].
 */
public class PostorderTraversal {

	public ArrayList<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		postorder(root, list);
		return list;
    }
	
	//后序遍历
	public void postorder(TreeNode root, List<Integer> list)
	{
		if(root!=null)
		{
			postorder(root.left, list);
			postorder(root.right, list);
			list.add(root.val);
		}
	}
}
