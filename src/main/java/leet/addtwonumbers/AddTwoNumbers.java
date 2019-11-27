package leet.addtwonumbers;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static leet.addtwonumbers.ListNode.list;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;
        ListNode end = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = val(l1) + val(l2) + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            if (result == null) {
                result = newNode;
            } else {
                end.next = newNode;
            }
            end = newNode;

            l1 = next(l1);
            l2 = next(l2);
        }

        if (carry != 0) {
            end.next = new ListNode(carry);
        }

        return result;
    }

    private int val(ListNode listNode) {
        if (listNode == null) {
            return 0;
        } else {
            return listNode.val;
        }
    }

    private ListNode next(ListNode listNode) {
        if (listNode == null) {
            return null;
        } else {
            return listNode.next;
        }
    }
}
