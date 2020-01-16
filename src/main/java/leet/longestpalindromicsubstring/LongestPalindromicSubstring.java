package leet.longestpalindromicsubstring;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String longest = "";
        int r = 0;
        int l = 0;

        while (r < s.length()) {
            if (s.charAt(l) == s.charAt(r)) {
                String palindrome = expandOut(l, r, s);
                if (palindrome.length() > longest.length()) {
                    longest = palindrome;
                }
            }

            if (l == r) {
                r++;
            } else {
                l++;
            }
        }

        return longest;
    }

    private String expandOut(int l, int r, String s) {
        int start = l;
        int end = r;

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            start = l;
            end = r;
            l--;
            r++;
        }

        return s.substring(start, end + 1);
    }
}
