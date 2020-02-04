package leet.phonecombinations

import spock.lang.Specification

class PhoneCombinationsTest extends Specification {
    def "letterCombinations() returns all of the letter combinations possible from a set of digits"() {
        expect:
        new PhoneCombinations().letterCombinations(a) == b

        where:
        a    || b
        "23" || ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
        ""   || []
    }
}
