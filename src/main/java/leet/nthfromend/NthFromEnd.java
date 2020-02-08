package leet.nthfromend;

import java.util.Objects;

public class NthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }

        ListNode preHead = new ListNode(0);
        preHead.next = head;

        ListNode current = preHead;
        for (int i = 0; i < n; i++) {
            current = current.next;
        }

        ListNode prev = preHead;
        while (current.next != null) {
            current = current.next;
            prev = prev.next;
        }

        if (prev.next == head) {
            return head.next;
        }

        prev.next = prev.next.next;

        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        if (next == null) {
            return listNode.next == null;
        }
        return val == listNode.val &&
            next.equals(listNode.next);

    }

    @Override
    public int hashCode() {
        return Objects.hash(val, next);
    }

    @Override
    public String toString() {
        return "" + val + "->" + next;
    }
}
