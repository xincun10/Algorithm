package com.offer;
/*
 * ��ת����
 * ����һ��������ת�����������������Ԫ�ء�
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
