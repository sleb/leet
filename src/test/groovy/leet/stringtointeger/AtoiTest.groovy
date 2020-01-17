package leet.stringtointeger

import spock.lang.Specification

class AtoiTest extends Specification {
    def "myAtoi() returns an integer from a string"() {
        expect:
        new Atoi().myAtoi(a) == b

        where:
        a                            || b
        "42"                         || 42
        "-345"                       || -345
        "   100"                     || 100
        "   -230"                    || -230
        "  0032"                     || 32
        "  -0082"                    || -82
        "  -0000023  3"              || -23
        "23sd221"                    || 23
        "sfkjs3312"                  || 0
        "1000000000000000000000000"  || Integer.MAX_VALUE
        "-1000000000000000000000000" || Integer.MIN_VALUE
    }
}
