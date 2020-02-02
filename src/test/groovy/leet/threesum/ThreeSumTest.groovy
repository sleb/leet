package leet.threesum

import spock.lang.Specification

class ThreeSumTest extends Specification {
    def "threeSum() return triplets of integers that sum to zero"() {
        expect:
        matches(new ThreeSum().threeSum(a as int[]), b)

        where:
        a                                                 || b
        [-1, 0, 1, 2, -1, -4]                             || [[-1, 0, 1], [-1, -1, 2]]
        [-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6] || [[-4, -2, 6], [-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-2, -2, 4], [-2, 0, 2]]
    }

    def matches(List<List<Integer>> a, List<List<Integer>> b) {
        a.size() == b.size() && Set.copyOf(a.collect { Set.copyOf(it) }) == Set.copyOf(b.collect { Set.copyOf(it) })
    }
}
