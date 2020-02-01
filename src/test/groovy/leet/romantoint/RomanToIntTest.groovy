package leet.romantoint

import spock.lang.Specification

class RomanToIntTest extends Specification {
    def "romanToInt() returns the int value for a roman numeral"() {
        expect:
        new RomanToInt().romanToInt(a) == b

        where:
        a           || b
        "I"         || 1
        "II"        || 2
        "III"       || 3
        "IV"        || 4
        "V"         || 5
        "VI"        || 6
        "VII"       || 7
        "VIII"      || 8
        "IX"        || 9
        "X"         || 10
        "XL"        || 40
        "L"         || 50
        "XC"        || 90
        "C"         || 100
        "CD"        || 400
        "D"         || 500
        "CM"        || 900
        "M"         || 1000
        "MMMCMXCIX" || 3999
    }
}
