package leet.lengthoflongestsubstring

import spock.lang.Specification

class LengthOfLongestSubstringTest extends Specification {
    def "lengthOfLongestSubstring() finds longest substring of input without repeating characters"() {
        expect:
        new LengthOfLongestSubstring().lengthOfLongestSubstring(a) == b

        where:
        a          || b
        "abcabcbb" || 3
        "bbbbb"    || 1
        "pwwkew"   || 3
        "dvdf"     || 3
        "abba"     || 2
        "abcdaefg" || 7
    }
}
