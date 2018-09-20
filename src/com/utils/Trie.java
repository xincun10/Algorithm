package com.utils;
/*
 * Trie树的相关操作
 * 一共26个英文字母，根节点为空，
 * 根节点的子节点是一个数组，大小为26
 * 数组的下标为字符-'a'
 */
public class Trie {

	private TrieNode root;
	
	public Trie()
	{
		root = new TrieNode();
	}
	
	//插入操作
	//加入插入一个字符串
	public void insert(String str)
	{
		if(str==null || str.length()==0)
		{
			return;
		}
		TrieNode node = root;
		//将目标字符串转换为字符数组
		char[] letters = str.toCharArray();
		for(int i=0, len=str.length(); i<len; i++)
		{
			//确定该字符在Trie树中的位置
			int pos = letters[i] - 'a';
			if(node.son[pos] == null)
			{
				//当前节点的子节点没有该字符
				node.son[pos] = new TrieNode();
				node.son[pos].val = letters[pos];
			}
			else
			{
				node.son[pos].num++;
			}
			node = node.son[pos];
		}
		node.isEnd = true;
	}
	
	//计算有某个前缀的单词的数量
	public int countPrefix(String prefix)
	{
		if(prefix==null || prefix.length()==0)
		{
			return -1;
		}
		TrieNode node = root;
		char[] letters = prefix.toCharArray();
		for(int i=0; i<letters.length; i++)
		{
			int pos = letters[i] - 'a';
			if(node.son[pos] == null)
			{
				return 0;
			}
			else
			{
				node = node.son[pos];
			}
		}
		return node.num;
	}
	
	// 在字典树中查找一个完全匹配的单词.
    public boolean has(String str)
    {
        if(str==null||str.length()==0)
        {
            return false;
        }
        TrieNode node=root;
        char[]letters=str.toCharArray();
        for(int i=0,len=str.length(); i<len; i++)
        {
            int pos=letters[i]-'a';
            if(node.son[pos]!=null)
            {
                node=node.son[pos];
            }
            else
            {
                return false;
            }
        }
        //走到这一步，表明可能完全匹配，可能部分匹配，如果最后一个字符节点为末端节点，则是完全匹配，否则是部分匹配
        return node.isEnd;
    }
    
    // 打印指定前缀的单词
    public String hasPrefix(String prefix)
    {
        if (prefix == null || prefix.length() == 0)
        {
            return null;
        }
        TrieNode node = root;
        char[] letters = prefix.toCharArray();
        for (int i = 0, len = prefix.length(); i < len; i++)
        {
            int pos = letters[i] - 'a';
            if (node.son[pos] == null)
            {
                return null;
            }
            else
            {
                node = node.son[pos];
            }
        }
        preTraverse(node, prefix);
        return null;
    }
    
    // 遍历经过此节点的单词.
    public void preTraverse(TrieNode node, String prefix)
    {
        if (!node.isEnd)
        {
            for (TrieNode child : node.son)
            {
                if (child != null)
                {
                    preTraverse(child, prefix + child.val);
                }
            }
            return;
        }
        System.out.println(prefix);
    }
    
    // 前序遍历字典树.
    public void preTraverse(TrieNode node)
    {
        if(node!=null)
        {
            System.out.print(node.val+"-");
            for(TrieNode child:node.son)
            {
                preTraverse(child);
            }
        }
    }
}
