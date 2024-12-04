package Strings;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        int i = 0;
        char[] c = s.toCharArray();
        while(i<c.length-k){
            c = reverse(c,i,i+k-1);
            i = i+k*2;
        }
        if(i<c.length){
            c = reverse(c,i,c.length-1);
            i = i+k*2;
        }
        return new String(c);
    }
    public static char[] reverse(char[] s, int start,int end){
        int i=start;
        int j = end;
        while(i<j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i+=1;
            j-=1;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefghi", 3));
    }
}