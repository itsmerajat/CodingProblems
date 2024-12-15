package Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    
    public static List<String> stringPermutation(String s){
        List<String> ans = new ArrayList<>();
        boolean[] flags = new boolean[s.length()];
        helper(s, flags, new StringBuilder(), ans);
        return ans;
    }

    public static void helper(String s,boolean[] flag,StringBuilder curr,List<String> ans){
        if(curr.length()==s.length()){
            ans.add(curr.toString());
            return;
        }
        for (int i = 0; i < flag.length; i++) {
            if(flag[i]==false){
                flag[i]=true;
                curr.append(s.charAt(i));
                helper(s, flag, curr, ans);
                curr.deleteCharAt(curr.length()-1);
                flag[i]=false;
            }
            
        }
        return;
    }
    public static void main(String[] args) {
        System.out.println(stringPermutation("ab"));
    }
}
