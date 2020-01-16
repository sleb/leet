package leet.longestpalindromicsubstring

import spock.lang.Specification

class LongestPalindromicSubstringTest extends Specification {
    def "longestPalindrome() finds longest palindromic substring"() {
        expect:
        new LongestPalindromicSubstring().longestPalindrome(a) == b

        where:
        a       || b
        "babad" || "bab"
        "cbbd"  || "bb"
    }
}
