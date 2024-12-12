package Strings;

class Solution {
    public static int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()){
            return -1;
        }
        int i=0;
        int j=0;
        while(i<haystack.length()){
            j=0;
            while(i<haystack.length() && j<needle.length() && haystack.charAt(i)==needle.charAt(j)){
                i+=1;
                j+=1;
            }
            if(j==needle.length())
                return i-needle.length();
            i+=1;
        }
        return -1;
    }
    public static void main(String[] args) {
        strStr("mississippi", "issip");
    }
}