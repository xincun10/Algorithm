package com.offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class PrintFromTopToBottom {
	public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root==null)	return list;
		//利用队列的先进先出特性
		Deque<TreeNode> queue = new LinkedList<>();
		queue.push(root);
		while(!queue.isEmpty())
		{
			TreeNode node = queue.pop();
			list.add(node.val);
			if(node.left!=null)
				queue.add(node.left);//add尾部添加,push是头部添加
			if(node.right!=null)
				queue.add(node.right);
		}
		return list;
    }
}
