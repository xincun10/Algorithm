package com.offer;
/*
 * 树的子结构
 * 输入两棵二叉树A，B，判断B是不是A的子结构。
 * （ps：我们约定空树不是任意一个树的子结构）
 */
public class HasSubTree {
	public boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1==null || root2==null)	return false;
		boolean result = false;
		if(root1.val == root2.val)//判断两颗树是否一样
		{
			result = isSubTree(root1, root2);
		}
		if(!result)
		{
			//否则比较左子树和右子树
			result = HasSubtree(root1.left, root2);
			if(!result)
			{
				result = HasSubtree(root1.right, root2);
			}
		}
		return result;
    }
	//判断两棵树的结构是否完全一样
	private boolean isSubTree(TreeNode root1, TreeNode root2)
	{
		if(root2==null)	return true;
		if(root1==null) return false;
		if(root1.val == root2.val)
		{
			//比较左子树和右子树
			return (isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right));
		}
		else
		{
			return false;
		}
	}
}
