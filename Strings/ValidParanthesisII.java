package Strings;

public class ValidParanthesisII {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int count = 1;
        while (i < j) {
            if (i < j && s.charAt(i) != s.charAt(j)) {
                if (count == 0)
                    return false;
                count -= 1;
                if (j - i == 1) {
                    return true;
                }
                return checkPalindrom(s, i + 1, j) || checkPalindrom(s, i, j - 1);
            } else {
                i += 1;
                j -= 1;
            }
        }
        return true;
    }

    public boolean checkPalindrom(String s, int i, int j) {
        while (i < j) {
            if (i < j && s.charAt(i) != s.charAt(j))
                return false;
            i += 1;
            j -= 1;
        }
        return true;
    }
}