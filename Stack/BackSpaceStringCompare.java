package Stack;

import java.util.Stack;

public class BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (Character c1 : s.toCharArray()) {
            if(c1=='#'){
                if(!stack1.empty())
                    stack1.pop();
            }
            else
                stack1.push(c1);
        }
        for (Character c2 : t.toCharArray()) {
            if(c2=='#'){
                if(!stack2.empty()){
                    stack2.pop();
                }
            }
            else
                stack2.push(c2);
        }
        while(!stack1.empty() && !stack2.empty()){
            if(!stack1.pop().equals(stack2.pop())){
                return false;
            }
        }
        return stack1.isEmpty() && stack2.empty();
    }
    public static void main(String[] args) {
        backspaceCompare("ab#c", "ad#c");
    }
}