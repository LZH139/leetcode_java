package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
}


class MyStack {
    Queue<Integer> q;

    /** Initialize your data structure here. */
    public MyStack() {
        q = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q.offer(x);
        for(int i=0;i<q.size()-1;i++){
            q.offer(q.poll());
        }

    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(!q.isEmpty()){
            return q.poll();
        }
        throw new RuntimeException("堆栈为空");
    }

    /** Get the top element. */
    public int top() {
        if(!q.isEmpty()){
            return q.element();
        }
        throw new RuntimeException("堆栈为空");

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();

    }
}