package leet.nthfromend

import spock.lang.Specification

class NthFromEndTest extends Specification {
    def "nthFromEnd() removes the element nth from the end"() {
        expect:
        new NthFromEnd().removeNthFromEnd(a, b) == c

        where:
        a                       | b || c
        listNode(1, 2, 3, 4, 5) | 2 || listNode(1, 2, 3, 5)
        listNode(1)             | 1 || null
        listNode(1, 2)          | 2 || listNode(2)
        listNode(1, 2)          | 1 || listNode(1)

    }

    def listNode(int ... ns) {
        if (ns.length == 0) {
            return null
        } else {
            def itr = ns.iterator();
            def head = new ListNode(itr.next() as int);
            def current = head;
            for (n in itr) {
                current.next = new ListNode(n as int)
                current = current.next
            }
            head
        }
    }
}
