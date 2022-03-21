package com.wj.daily.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.wj.daily.list.ReserveLinkedList.ListNode;

class ReserveLinkedListTest {

    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

    @Test
    void reverseList() {
        ReserveLinkedList reserveLinkedList = new ReserveLinkedList();
        ListNode listNode = reserveLinkedList.reverseList(head);
        //System.out.println(listNode.toString());
        Assertions.assertEquals("ListNode{val=5, next=ListNode{val=4, next=ListNode{val=3, next=ListNode{val=2, next=ListNode{val=1, next=null}}}}}",
                listNode.toString());
    }

    @Test
    void reverseListRecursive() {
        ReserveLinkedList reserveLinkedList = new ReserveLinkedList();
        ListNode listNode = reserveLinkedList.reverseListRecursive(new ListNode(3, new ListNode(4, new ListNode(5))));
        //System.out.println(listNode.toString());
        Assertions.assertEquals("ListNode{val=5, next=ListNode{val=4, next=ListNode{val=3, next=ListNode{val=2, next=ListNode{val=1, next=null}}}}}",
                listNode.toString());
    }
}