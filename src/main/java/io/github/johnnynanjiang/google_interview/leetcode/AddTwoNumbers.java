package io.github.johnnynanjiang.google_interview.leetcode;

import org.springframework.stereotype.Component;

import java.util.Stack;

@Component
public class AddTwoNumbers {
    public ListNode go(ListNode l1, ListNode l2) {
        Stack<Integer> stack = new Stack<>();

        int numberOfZeroToFillTheGap = 0;
        ListNode l1Tmp = l1, l2Tmp = l2;
        while (true) {
            if (l1Tmp == null)  {
                numberOfZeroToFillTheGap++;
            } else {
                l1Tmp = l1Tmp.next;
            }

            if (l2Tmp == null) {
                numberOfZeroToFillTheGap--;
            } else {
                l2Tmp = l2Tmp.next;
            }

            if ((l1Tmp == null) && (l2Tmp == null)) {
                break;
            }
        }


        for (int i = 0; i < Math.abs(numberOfZeroToFillTheGap); i++) {
            if (numberOfZeroToFillTheGap >= 0) {
                ListNode newNode = new ListNode(0);
                newNode.next = l1;
                l1 = newNode;
            } else {
                ListNode newNode = new ListNode(0);
                newNode.next = l2;
                l2 = newNode;
            }
        }

        while (!((l1 == null) && (l2 == null))) {
            int v1 = (l1 == null) ? 0 : l1.val;
            int v2 = (l2 == null) ? 0 : l2.val;

            System.out.println(String.format("stack.push(%d)", v1 + v2));
            stack.push(v1 + v2);

            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }

        ListNode result = null;

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
            } else {
                newNode.next = result;
                result = newNode;
            }

            System.out.println(String.format("add ListNode(%d), remainder %d", valueToPutIn, remainder));
        }

        return result;
    }
}
