package Redo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonCharacter {
    public List<String> commonChars(String[] words) {
        
        int n=words.length;
        int k;

        int[][] freq = new int[n-1][26];

        for (int j = 1; j < words.length; j++) {
            for (int i = 0; i < words[j].length(); i++) {
                freq[j-1][words[j].charAt(i)-'a']+=1;
            }
        }

        List<String> res = new ArrayList<>();

        // for (int i = 0; i < words[0].length(); i++) {
        for (Character Char : words[0].toCharArray()) {
            for (k = 0; k < words.length; k++) {
                if(freq[k-1][Char-'a']>0){
                    freq[k-1][Char-'a']-=1;
                }
                else{
                    break;
                }
            }
            // Means all the words has that character
            if(k==n)
            res.add(Char + "");
        }
        return res;

    }
}