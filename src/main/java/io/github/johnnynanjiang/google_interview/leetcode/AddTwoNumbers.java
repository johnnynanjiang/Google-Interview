package io.github.johnnynanjiang.google_interview.leetcode;

import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
public class AddTwoNumbers {
    public ListNode go(ListNode l1, ListNode l2) {
        Stack<Integer> stack = new Stack<Integer>();

        while (!((l1 == null) && (l2 == null))) {
            System.out.println(String.format("stack.push(%d)", l1.val + l2.val));
            stack.push(l1.val + l2.val);
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode result = null, currentNode = null;

        Integer remainder = 0;

        while (!stack.empty()) {
            Integer valueInStack = stack.pop();

            valueInStack = valueInStack + remainder;

            Integer valueToPutIn = valueInStack % 10;
            Integer valueToRemain = valueInStack / 10;

            remainder = valueToRemain;

            ListNode newNode = new ListNode(valueToPutIn);
            if (result == null) {
                result = newNode;
                currentNode = newNode;
            } else {
                currentNode.next = newNode;
                currentNode = newNode;
            }

            System.out.println(String.format("add ListNode(%d), remainder %d", valueToPutIn, remainder));
        }

        return result;
    }
}
