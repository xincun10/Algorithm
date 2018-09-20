package com.utils;
/*
 * 字典树结构
 */
public class TrieNode {

	public static final int SIZE = 26;//一共有26个单词
	public int num;// 有多少单词通过这个节点,即由根至该节点组成的字符串模式出现的次数
    public TrieNode[] son;// 所有的儿子节点
    public boolean isEnd;// 是不是最后一个节点
    public char val;// 节点的值

    TrieNode()
    {
        num = 1;
        son = new TrieNode[SIZE];
        isEnd = false;
    }
}
