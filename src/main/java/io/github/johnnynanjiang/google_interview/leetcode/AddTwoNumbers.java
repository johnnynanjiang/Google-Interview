package io.github.johnnynanjiang.google_interview.leetcode;

import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
public class AddTwoNumbers {
    public ListNode go(ListNode l1, ListNode l2) {
        ListNode result = null, currentNode = null;
        int remainder = 0;

        while (!((l1 == null) && (l2 == null))) {
            int v1 = (l1 == null) ? 0 : l1.val;
            int v2 = (l2 == null) ? 0 : l2.val;
            int sum = v1 + v2 + remainder;

            System.out.println(String.format("stack.push(%d)", v1 + v2));

            int valueToPutIn = sum % 10;
            int valueToRemain = sum / 10;

            remainder = valueToRemain;

            ListNode newNode = new ListNode(valueToPutIn);
            if (result == null) {
                result = newNode;
            } else {
                currentNode.next = newNode;
            }
            currentNode = newNode;

            System.out.println(String.format("add ListNode(%d), remainder %d", valueToPutIn, remainder));

            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }

        if (remainder > 0) {
            ListNode newNode = new ListNode(remainder);
            currentNode.next = newNode;
            currentNode = newNode;
        }

        return result;
    }
}
