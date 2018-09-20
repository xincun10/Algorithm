package com.utils;
/*
 * Trie������ز���
 * һ��26��Ӣ����ĸ�����ڵ�Ϊ�գ�
 * ���ڵ���ӽڵ���һ�����飬��СΪ26
 * ������±�Ϊ�ַ�-'a'
 */
public class Trie {

	private TrieNode root;
	
	public Trie()
	{
		root = new TrieNode();
	}
	
	//�������
	//�������һ���ַ���
	public void insert(String str)
	{
		if(str==null || str.length()==0)
		{
			return;
		}
		TrieNode node = root;
		//��Ŀ���ַ���ת��Ϊ�ַ�����
		char[] letters = str.toCharArray();
		for(int i=0, len=str.length(); i<len; i++)
		{
			//ȷ�����ַ���Trie���е�λ��
			int pos = letters[i] - 'a';
			if(node.son[pos] == null)
			{
				//��ǰ�ڵ���ӽڵ�û�и��ַ�
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
	
	//������ĳ��ǰ׺�ĵ��ʵ�����
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
	
	// ���ֵ����в���һ����ȫƥ��ĵ���.
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
        //�ߵ���һ��������������ȫƥ�䣬���ܲ���ƥ�䣬������һ���ַ��ڵ�Ϊĩ�˽ڵ㣬������ȫƥ�䣬�����ǲ���ƥ��
        return node.isEnd;
    }
    
    // ��ӡָ��ǰ׺�ĵ���
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
    
    // ���������˽ڵ�ĵ���.
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
    
    // ǰ������ֵ���.
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
