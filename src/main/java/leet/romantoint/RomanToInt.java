package leet.romantoint;

public class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            String curr = s.substring(i, Math.min(i + 2, s.length()));
            switch (curr) {
                case "IV":
                    result += 4;
                    i++;
                    break;
                case "IX":
                    result += 9;
                    i++;
                    break;
                case "XL":
                    result += 40;
                    i++;
                    break;
                case "XC":
                    result += 90;
                    i++;
                    break;
                case "CD":
                    result += 400;
                    i++;
                    break;
                case "CM":
                    result += 900;
                    i++;
                    break;
                default:
                    switch (curr.charAt(0)) {
                        case 'I':
                            result += 1;
                            break;
                        case 'V':
                            result += 5;
                            break;
                        case 'X':
                            result += 10;
                            break;
                        case 'L':
                            result += 50;
                            break;
                        case 'C':
                            result += 100;
                            break;
                        case 'D':
                            result += 500;
                            break;
                        case 'M':
                            result += 1000;
                            break;
                    }
            }
        }

        return result;
    }
}
