package leet.addtwonumbers;

import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    static ListNode list(List<Integer> ns) {
        ListNode listNode = null;
        ListNode end = null;
        for (int n : ns) {
            ListNode newListNode = new ListNode(n);
            if (listNode == null) {
                listNode = newListNode;
            } else {
                end.next = newListNode;
            }
            end = newListNode;
        }
        return listNode;
    }

    @Override
    public String toString() {
        ListNode node = this;
        StringBuilder sb = new StringBuilder("(");
        while (node.next != null) {
            sb.append(node.val).append(" -> ");
            node = node.next;
        }
        return sb.append(node.val).append(")").toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof ListNode)) return false;

        ListNode other = (ListNode) obj;
        if (val != other.val) return false;
        if (next != null) return next.equals(other.next);

        return true;
    }
}
