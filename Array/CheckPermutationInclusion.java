package Array;

import java.util.Arrays;

public class CheckPermutationInclusion {
    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1charArray = new int[26];
        for (char c : s1.toCharArray()) {
            s1charArray[c - 'a'] += 1;
        }
        int[] s2charArray = new int[26];
        for (int j = 0; j < s1.length(); j++) {
            s2charArray[s2.charAt(j) - 'a'] += 1;
        }
        int n = s2.length() - s1.length();
        int i = 0;
        while (i < n) {
            if (Arrays.equals(s1charArray, s2charArray)) {
                return true;
            }
            s2charArray[s2.charAt(i) - 'a'] -= 1;
            s2charArray[s2.charAt(i + s1.length()) - 'a'] += 1;
            i += 1;
        }
        return Arrays.equals(s1charArray, s2charArray);

    }

    public static void main(String[] args) {
        checkInclusion("adc", "dcda");
    }

}