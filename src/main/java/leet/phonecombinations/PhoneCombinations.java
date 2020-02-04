package leet.phonecombinations;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PhoneCombinations {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return List.of();
        }

        List<String> result = new LinkedList<>();
        letterCombinations(result, "", digits);
        return result;
    }

    private void letterCombinations(List<String> acc, String prefix, String digits) {
        if (digits.isEmpty()) {
            acc.add(prefix);
        } else {
            char head = digits.charAt(0);
            String tail = digits.substring(1);
            for (char c : KEYS.getOrDefault(head, List.of())) {
                letterCombinations(acc, prefix + c, tail);
            }
        }
    }

    private static final Map<Character, List<Character>> KEYS = Map.of(
        '1', List.of(),
        '2', List.of('a', 'b', 'c'),
        '3', List.of('d', 'e', 'f'),
        '4', List.of('g', 'h', 'i'),
        '5', List.of('j', 'k', 'l'),
        '6', List.of('m', 'n', 'o'),
        '7', List.of('p', 'q', 'r', 's'),
        '8', List.of('t', 'u', 'v'),
        '9', List.of('w', 'x', 'y', 'z'),
        '0', List.of()
    );
}
