package Stack;

import java.util.Stack;

public class StackUsingQueue {
    Stack<Integer> stack1 = null;
    Stack<Integer> stack2 = null;
    public StackUsingQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int x) {
        this.stack1.add(x);
    }

    public int pop() {
        while(!this.stack1.empty()){
            this.stack2.push(this.stack1.pop());
        }
        int res = this.stack2.pop();
        while(!this.stack2.empty()){
            this.stack1.push(this.stack2.pop());
        }
        return res;
    }

    public int peek() {
        while(!this.stack1.empty()){
            this.stack2.push(this.stack1.pop());
        }
        int res = this.stack2.peek();
        while(!this.stack2.empty()){
            this.stack1.push(this.stack2.pop());
        }
        return res;
    }

    public boolean empty() {
        return this.stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * StackUsingQueue obj = new StackUsingQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */