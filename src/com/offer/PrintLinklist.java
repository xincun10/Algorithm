package com.offer;

import java.util.*;


public class PrintLinklist {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> al = new ArrayList<>();
        while(!stack.empty())
        {
            al.add(stack.pop());
        }
        return al;
    }
}