package com.offer;
/*
 * 链表中倒数第k个结点
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class FindKthToTail {
	/*
	 * 两个指针，一个指向1，一个指向k+1
	 * 当k+1到尾时，1所指即所求
	 */
	public ListNode FindKthToTail(ListNode head,int k) {
		ListNode node = head;
		ListNode res = head;
		for(int i=0; i<k; i++)
		{
			try {
				node = node.next;
			}catch(Exception e)
			{
				return null;
			}
		}
		while(node!=null)
		{
			node = node.next;
			res = res.next;
		}
		return res;
    }
}
