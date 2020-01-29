package leet.regexmatching

import spock.lang.Specification

class RegexTest extends Specification {
    def "isMatch() returns true if the pattern matches"() {
        expect:
        new Regex().isMatch(s, p) == match

        where:
        s             | p            || match
        "aa"          | "a"          || false
        "aa"          | "a*"         || true
        "ab"          | ".*"         || true
        "aab"         | "c*a*b"      || true
        "mississippi" | "mis*is*p*." || false
        "ab"          | ".*c"        || false
    }

    def "Str_toString()"() {
        expect:
        a.toString() == b

        where:
        a                        || b
        Str.from("abcdefg")      || "Str(abcdefg)"
        Str.from("")             || "Str()"
        Str.from("a")            || "Str(a)"
        Str.from("ab").substr(1) || "Str(b)"
        Str.from("a").substr(1)  || "Str()"
    }

    def "Str_substr()"() {
        expect:
        a == b

        where:
        a               || b
        Str.from("abc") || Str.from("abc").substr(0)
        Str.from("abc") || Str.from("aabc").substr(1)
    }

    def "Str_isEmpty()"() {
        expect:
        a.isEmpty() == b

        where:
        a                                  || b
        Str.from("")                       || true
        Str.from("a")                      || false
        Str.from("a").substr(1)            || true
        Str.from("ab").substr(1).substr(1) || true
        Str.from("ab").substr(1)           || false
    }

    def "Str_charAt()"() {
        expect:
        a.charAt(b) == c as char

        where:
        a               | b || c
        Str.from("a")   | 0 || 'a'
        Str.from("abc") | 2 || 'c'
    }

    def "Str_length()"() {
        expect:
        a.length() == b

        where:
        a                         || b
        Str.from("")              || 0
        Str.from("a")             || 1
        Str.from("ab")            || 2
        Str.from("abc").substr(1) || 2
    }
}
