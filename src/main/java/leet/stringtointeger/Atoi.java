package leet.stringtointeger;

import java.util.Deque;
import java.util.LinkedList;

public class Atoi {
    public int myAtoi(String str) {
        int sign = 1;
        boolean numStarted = false;
        boolean foundNonZero = false;
        Deque<Integer> digits = new LinkedList<>();
        for (char c : str.toCharArray()) {
            if (isDigit(c)) {
                numStarted = true;
                if (foundNonZero || c != '0') {
                    foundNonZero = true;
                    digits.push(ctoi(c));
                }
            } else if (numStarted) {
                break;
            } else {
                if (c != ' ') {
                    if (c == '-') {
                        numStarted = true;
                        sign = -1;
                    } else if (c == '+') {
                        numStarted = true;
                        sign = 1;
                    } else {
                        break;
                    }
                }
            }
        }

        long result = 0;
        long place = 1;
        for (int i : digits) {
            long tmp = place * sign + result;
            result = i * place * sign + result;
            if (result > Integer.MAX_VALUE || tmp > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (result < Integer.MIN_VALUE || tmp < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            place *= 10;
        }

        return (int) result;
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private int ctoi(char c) {
        return c - '0';
    }
}
