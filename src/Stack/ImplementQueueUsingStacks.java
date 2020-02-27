package Stack;

import java.util.Stack;

public class ImplementQueueUsingStacks {
}

class MyQueue {
    Stack<Integer> s;
    Stack<Integer> h;


    /** Initialize your data structure here. */
    public MyQueue() {
        s = new Stack<>();
        h = new Stack<>();

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!s.isEmpty()){
            h.push(s.pop());
        }
        s.push(x);
        while (!h.isEmpty()){
            s.push(h.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(!s.isEmpty()){
            return s.pop();
        }

        throw new RuntimeException("栈为空");
    }

    /** Get the front element. */
    public int peek() {
        if(!s.isEmpty()){
            return s.peek();
        }

        throw new RuntimeException("栈为空");
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.isEmpty();
    }
}