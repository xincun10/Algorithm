package com.offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/*
 * �������´�ӡ����������ÿ���ڵ㣬ͬ��ڵ�������Ҵ�ӡ��
 */
public class PrintFromTopToBottom {
	public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(root==null)	return list;
		//���ö��е��Ƚ��ȳ�����
		Deque<TreeNode> queue = new LinkedList<>();
		queue.push(root);
		while(!queue.isEmpty())
		{
			TreeNode node = queue.pop();
			list.add(node.val);
			if(node.left!=null)
				queue.add(node.left);//addβ�����,push��ͷ�����
			if(node.right!=null)
				queue.add(node.right);
		}
		return list;
    }
}
