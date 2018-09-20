package com.offer;
/*
 * �����ӽṹ
 * �������ö�����A��B���ж�B�ǲ���A���ӽṹ��
 * ��ps������Լ��������������һ�������ӽṹ��
 */
public class HasSubTree {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1==null || root2==null)	return false;
		boolean result = false;
		if(root1.val == root2.val)//�ж��������Ƿ�һ��
		{
			result = isSubTree(root1, root2);
		}
		if(!result)
		{
			//����Ƚ���������������
			result = HasSubtree(root1.left, root2);
			if(!result)
			{
				result = HasSubtree(root1.right, root2);
			}
		}
		return result;
    }
	//�ж��������Ľṹ�Ƿ���ȫһ��
	private boolean isSubTree(TreeNode root1, TreeNode root2)
	{
		if(root2==null)	return true;
		if(root1==null) return false;
		if(root1.val == root2.val)
		{
			//�Ƚ���������������
			return (isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right));
		}
		else
		{
			return false;
		}
	}
}
