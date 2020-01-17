package leet.reverseinteger

import spock.lang.Specification

class ReverseIntegerTest extends Specification {
    def "reverse() returns an integer reversed"() {
        expect:
        new ReverseInteger().reverse(a) == b

        where:
        a          || b
        1534236469 || 0
        123        || 312
        120        || 12
        -5467      || -7645
    }
}
