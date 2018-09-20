package com.offer;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author Administrator
 *
 */
public class ConstructBinaryTree {

	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		return reConstructBinaryTree(pre, 0, pre.length, in, 0, in.length);
    }
	
	public TreeNode reConstructBinaryTree(int [] pre, int startPre, int endPre, int [] in, int startIn, int endIn) {
		if(startPre>=endPre||startIn>=endIn)
            return null;
		TreeNode root = new TreeNode(pre[startPre]);
		for(int index=startIn; index<endIn; index++)
		{
			if(in[index] == pre[startPre])
			{
				root.left = reConstructBinaryTree(pre, startPre+1, startPre+index-startIn+1, in, startIn, index);
				root.right = reConstructBinaryTree(pre, startPre+index-startIn+1, endPre, in, index+1, endIn);
				break;
			}
		}
        return root;
    }
}
