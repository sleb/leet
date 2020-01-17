package leet.reverseinteger;

import java.util.Deque;
import java.util.LinkedList;

public class ReverseInteger {
    public int reverse(int x) {
        Deque<Integer> digits = new LinkedList<>();
        while (x != 0) {
            digits.push(x % 10);
            x /= 10;
        }

        long place = 1;
        long result = 0;
        while (!digits.isEmpty()) {
            result += place * digits.pop();
            place *= 10;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
