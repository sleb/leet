package leet.palindromenumber

import spock.lang.Specification

class PalindromeNumberTest extends Specification {
    def "isPalindrome() returns true if a number is a palindrome"() {
        expect:
        new PalindromeNumber().isPalindrome(a) == b

        where:
        a    || b
        0    || true
        -1   || false
        121  || true
        1551 || true
        1234 || false
    }
}
