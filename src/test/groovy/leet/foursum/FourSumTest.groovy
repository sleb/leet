package leet.foursum

import spock.lang.Specification

class FourSumTest extends Specification {
    def "fourSum() returns sets of 4 digits that add up to the target"() {
        expect:
        new FourSum().fourSum(a as int[], b) == c

        where:
        a                           | b || c
        [1, 0, -1, 0, -2, 2]        | 0 || [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
        [0, 0, 0, 0]                | 0 || [[0, 0, 0, 0]]
        [-3, -2, -1, 0, 0, 1, 2, 3] | 0 || [[-3, -2, 2, 3], [-3, -1, 1, 3], [-3, 0, 0, 3], [-3, 0, 1, 2], [-2, -1, 0, 3], [-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
    }
}
