package leet.longestcommonprefix;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String shortest = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).orElse("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortest.length(); i++) {
            Character c = null;
            for (String str : strs) {
                if (c == null) {
                    c = str.charAt(i);
                } else if (str.charAt(i) != c) {
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
