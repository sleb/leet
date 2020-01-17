package leet.palindromenumber;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        List<Integer> digits = getDigits(x);
        int l = (digits.size() - 1) / 2;
        int r = digits.size() / 2;
        while (l >= 0 && r < digits.size()) {
            if (!digits.get(l).equals(digits.get(r))) {
                return false;
            }
            l--;
            r++;
        }

        return true;
    }

    private List<Integer> getDigits(int x) {
        List<Integer> digits = new ArrayList<>();
        while (x > 0) {
            digits.add(x % 10);
            x /= 10;
        }

        return digits;
    }
}
