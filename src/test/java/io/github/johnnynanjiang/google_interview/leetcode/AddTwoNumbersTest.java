package io.github.johnnynanjiang.google_interview.leetcode;

import io.github.johnnynanjiang.google_interview.util.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by nanjiang on 22/11/17.
 */

public class AddTwoNumbersTest extends BaseTest {
    @Autowired
    AddTwoNumbers addTwoNumbers;

    @Test
    public void testNormalCase() {
        ListNode l1, l2;

        // 0 4 3
        ListNode l1_1 = new ListNode(0);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(3);

        l1 = l1_1;
        l1_1.next = l1_2;
        l1_2.next = l1_3;

        // 5 6 4
        ListNode l2_1 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(4);

        l2 = l2_1;
        l2_1.next = l2_2;
        l2_2.next = l2_3;

        ListNode result = addTwoNumbers.go(l1, l2);

        // 6 0 7
        assertEquals(5, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void testEdgeCase() {
        ListNode l1, l2;

        // 0 4
        ListNode l1_1 = new ListNode(0);
        ListNode l1_2 = new ListNode(4);

        l1 = l1_1;
        l1_1.next = l1_2;

        // 5 6 3
        ListNode l2_1 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(3);

        l2 = l2_1;
        l2_1.next = l2_2;
        l2_2.next = l2_3;

        ListNode result = addTwoNumbers.go(l1, l2);

        // 5 0 4
        assertEquals(5, result.val);
        assertEquals(0, result.next.val);
        assertEquals(4, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void testNullCase() {
        ListNode l1, l2;

        // 1 4
        ListNode l1_1 = new ListNode(1);
        ListNode l1_2 = new ListNode(4);

        l1 = l1_1;
        l1_1.next = l1_2;

        // null
        l2 = null;

        ListNode result = addTwoNumbers.go(l1, l2);

        // 1 4
        assertEquals(1, result.val);
        assertEquals(4, result.next.val);
    }

    @Test
    public void test5Plus5Case() {
        // 5
        ListNode l1 = new ListNode(5);

        // 5
        ListNode l2 = new ListNode(5);

        ListNode result = addTwoNumbers.go(l1, l2);

        // 0 1
        assertEquals(0, result.val);
        assertEquals(1, result.next.val);
    }
}