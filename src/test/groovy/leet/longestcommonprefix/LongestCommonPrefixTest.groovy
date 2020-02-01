package leet.longestcommonprefix

import spock.lang.Specification

class LongestCommonPrefixTest extends Specification {
    def "longestCommonPrefix() returns longest common prefix of an array of strings"() {
        expect:
        new LongestCommonPrefix().longestCommonPrefix(a as String[]) == b

        where:
        a                            || b
        ["flower", "flow", "flight"] || "fl"
        [""]                         || ""
        ["car", "racecar", "train"]  || ""
        ["flower", "flower"]         || "flower"
    }
}
