package leet.twosum

import spock.lang.Specification

class TwoSumTest extends Specification {
    def "twoSum() returns indices of the two numbers that add up to the target"() {
        expect:
        new TwoSum().twoSum(nums as int[], target) == indices as int[]

        where:
        nums           | target || indices
        [1, 2, 3]      | 5      || [1, 2]
        [2, 7, 11, 15] | 9      || [0, 1]
        [3, 2, 4]      | 6      || [1, 2]
    }
}
