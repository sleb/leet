package leet.threesumclosest

import spock.lang.Specification

class ThreeSumClosestTest extends Specification {
    def "threeSumClosest() returns the sum of 3 numbers closest to the target"() {
        expect:
        new ThreeSumClosest().threeSumClosest(a as int[], b) == c

        where:
        a              | b || c
        [-1, 2, 1, -4] | 1 || 2
        [0, 1, 2]      | 3 || 3
    }
}
