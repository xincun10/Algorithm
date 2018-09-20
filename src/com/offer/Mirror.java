package com.offer;
/*
 * 二叉树的镜像
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 */
public class Mirror {
	public void Mirror(TreeNode root) {
		if(root == null) return;
		if(root.left==null && root.right==null)	return;
		//交换两棵子树
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		//递归
        if(root.left!=null)
        {
        	Mirror(root.left);
        }
        if(root.right!=null)
        {
        	Mirror(root.right);
        }
    }
	
}
