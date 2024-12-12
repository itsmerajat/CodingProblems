package Strings;

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> mapper = new HashMap<>();

        String[] sArr = s.split(" ");
        String[] ans = new String[pattern.length()];
        
        if(sArr.length!=pattern.length())
            return false;
        for(int i=0;i<sArr.length;i++){
            mapper.put(pattern.charAt(i),sArr[i]);
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = mapper.get(pattern.charAt(i));
        }
        String str = String.join(" ",ans);
        return str.equals(s);
    }
    public static void main(String[] args) {
        wordPattern("abba", "dog cat cat dog");
    }
}