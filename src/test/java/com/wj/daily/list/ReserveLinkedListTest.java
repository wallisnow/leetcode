package com.wj.daily.list;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.wj.daily.list.ReserveLinkedList.*;
import static org.junit.jupiter.api.Assertions.*;

class ReserveLinkedListTest {

    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

    @Test
    void reverseList() {
        ReserveLinkedList reserveLinkedList = new ReserveLinkedList();
        ListNode listNode = reserveLinkedList.reverseList(head);
        System.out.println(listNode.toString());
    }
}