package com.offer;
/*
 * 反转链表
 * 输入一个链表，反转链表后，输出链表的所有元素。
 */
public class ReverseList {
	public ListNode ReverseList(ListNode head) {
		ListNode ppre = null;
		ListNode phead = null;
		ListNode pnode = head;
		while(pnode!=null)
		{
			ListNode pnext = pnode.next;
			if(pnode.next==null)
				phead = pnode;
			pnode.next = ppre;
			ppre = pnode;
			pnode = pnext;
		}
		return phead;
    }
}
