package leet.regexmatching;

public class Regex {
    public boolean isMatch(String string, String pattern) {
        return isMatch(Str.from(string), Str.from(pattern));
    }

    private boolean isMatch(Str string, Str pattern) {
        if (pattern.isEmpty()) {
            return string.isEmpty();
        }

        char p = pattern.charAt(0);
        boolean headMatches = !string.isEmpty() && (p == string.charAt(0) || p == '.');
        if (pattern.length() >= 2 && pattern.charAt(1) == '*') {
            // p: a*, s: b
            return isMatch(string, pattern.substr(2)) || (headMatches && isMatch(string.substr(1), pattern));
        } else {
            return headMatches && isMatch(string.substr(1), pattern.substr(1));
        }
    }
}

class Str {
    private final String s;
    private final int i;

    private Str(String s, int i) {
        this.s = s;
        this.i = i;
    }

    static Str from(String s) {
        return new Str(s, 0);
    }

    char charAt(int i) {
        return this.s.charAt(this.i + i);
    }

    Str substr(int i) {
        return new Str(this.s, this.i + i);
    }

    int length() {
        return this.s.length() - this.i;
    }

    boolean isEmpty() {
        return this.i == this.s.length();
    }

    @Override
    public String toString() {
        return String.format("Str(%s)", this.s.substring(this.i));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Str)) {
            return false;
        }

        Str that = (Str) obj;
        return this.s.substring(this.i).equals(that.s.substring(that.i));
    }
}
