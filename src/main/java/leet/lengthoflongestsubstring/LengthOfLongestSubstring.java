package leet.lengthoflongestsubstring;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int length = 0;

        Map<Character, Integer> seen = new HashMap<>();
        while (end < s.length()) {
            char c = s.charAt(end);
            Integer index = seen.put(c, end);
            if (index != null) {
                start = Math.max(start, index + 1);
            }

            length = Math.max(length, end - start + 1);
            end++;
        }

        return length;
    }
}
