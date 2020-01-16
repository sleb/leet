package leet.zigzagconversion;

import java.util.HashMap;
import java.util.Map;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s.isEmpty() || numRows == 1) return s;
        int inc = 1;
        int line = 0;
        Map<Integer, StringBuilder> lineToChars = new HashMap<>();
        for (char c : s.toCharArray()) {
            lineToChars.computeIfAbsent(line, k -> new StringBuilder()).append(c);
            line += inc;
            if ((line == numRows - 1 && inc == 1) || (line == 0 && inc == -1)) {
                inc *= -1;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            StringBuilder lineBuffer = lineToChars.get(i);
            if (lineBuffer != null) {
                sb.append(lineBuffer);
            }
        }
        return sb.toString();
    }
}
