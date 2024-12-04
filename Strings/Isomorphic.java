package Strings;

import java.util.HashMap;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sArray = s.toCharArray();
        HashMap<Character,Character> mapper = new HashMap<>();

        int i = 0;
        while(i<s.length()){
            if(mapper.containsKey(sArray[i])){
                sArray[i] = mapper.get(s.charAt(i));
            }
            else{
                if(mapper.containsValue(t.charAt(i)))
                    return false;
                mapper.put(s.charAt(i),t.charAt(i));
                sArray[i] = t.charAt(i);
            }
            i+=1;
        }
        String string = new String(sArray);
        return string.equals(t);
    }
}