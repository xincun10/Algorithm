package com.offer;
/*
 * �������ľ���
 * ���������Ķ�����������任ΪԴ�������ľ���
 */
public class Mirror {
	public void Mirror(TreeNode root) {
		if(root == null) return;
		if(root.left==null && root.right==null)	return;
		//������������
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		//�ݹ�
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
