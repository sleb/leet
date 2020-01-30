package leet.maxarea

import spock.lang.Specification

class MaxAreaTest extends Specification {
    def "maxArea() returns max area"() {
        expect:
        new MaxArea().maxArea(a as int[]) == b

        where:
        a                           || b
        [1, 8, 6, 2, 5, 4, 8, 3, 7] || 49
    }
}
