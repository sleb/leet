package leet.inttoroman

import spock.lang.Specification

class IntToRomanTest extends Specification {
    def "intToRoman() returns roman numeral for int"() {
        expect:
        new IntToRoman().intToRoman(a) == b

        where:
        a    || b
        1    || "I"
        2    || "II"
        3    || "III"
        4    || "IV"
        5    || "V"
        6    || "VI"
        7    || "VII"
        8    || "VIII"
        9    || "IX"
        10   || "X"
        11   || "XI"
        12   || "XII"
        13   || "XIII"
        14   || "XIV"
        15   || "XV"
        16   || "XVI"
        58   || "LVIII"
        240  || "CCXL"
        1994 || "MCMXCIV"
        2500 || "MMD"
        3499 || "MMMCDXCIX"
        3999 || "MMMCMXCIX"
    }
}
