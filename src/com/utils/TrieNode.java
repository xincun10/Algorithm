package com.utils;
/*
 * �ֵ����ṹ
 */
public class TrieNode {

	public static final int SIZE = 26;//һ����26������
	public int num;// �ж��ٵ���ͨ������ڵ�,���ɸ����ýڵ���ɵ��ַ���ģʽ���ֵĴ���
    public TrieNode[] son;// ���еĶ��ӽڵ�
    public boolean isEnd;// �ǲ������һ���ڵ�
    public char val;// �ڵ��ֵ

    TrieNode()
    {
        num = 1;
        son = new TrieNode[SIZE];
        isEnd = false;
    }
}
