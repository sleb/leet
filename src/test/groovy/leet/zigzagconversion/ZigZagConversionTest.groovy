package leet.zigzagconversion

import spock.lang.Specification

class ZigZagConversionTest extends Specification {
    def "zigZagConversion() finds prints the string in zig zag order"() {
        expect:
        new ZigZagConversion().convert(s, numRows) == result

        where:
        s                | numRows || result
        "PAYPALISHIRING" | 3       || "PAHNAPLSIIGYIR"
        "PAYPALISHIRING" | 4       || "PINALSIGYAHRPI"
        ""               | 1       || ""
        "A"              | 2       || "A"
        "AB"             | 1       || "AB"
    }
}
