package leet.addtwonumbers

import spock.lang.Specification

import static leet.addtwonumbers.ListNode.list

class AddTwoNumbersTest extends Specification {
    def "addTwoNumbers() returns the sum of two inputs"() {
        expect:
        new AddTwoNumbers().addTwoNumbers(a, b) == c

        where:
        a               | b               || c
        list([2, 4, 3]) | list([5, 6, 4]) || list([7, 0, 8])
        list([5])       | list([5])       || list([0, 1])
        list([1, 8])    | list([0])       || list([1, 8])
    }
}
