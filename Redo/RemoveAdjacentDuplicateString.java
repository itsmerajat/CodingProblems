package Redo;

// Optimize it.


import java.util.Stack;

public class RemoveAdjacentDuplicateString {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character c: s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            }
            else{
                if(c==stack.peek()){
                    stack.pop();
                }
            }
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans = stack.pop() + ans;
        }
        return ans;
    }
}