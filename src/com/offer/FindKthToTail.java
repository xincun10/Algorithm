package com.offer;
/*
 * �����е�����k�����
 * ����һ����������������е�����k����㡣
 */
public class FindKthToTail {
	/*
	 * ����ָ�룬һ��ָ��1��һ��ָ��k+1
	 * ��k+1��βʱ��1��ָ������
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
