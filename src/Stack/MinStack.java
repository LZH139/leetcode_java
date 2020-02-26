package Stack;

import java.util.Stack;

public class MinStack {

    private Stack<Integer> data;
    private Stack<Integer> helper;

    /** initialize your data structure here. */
    public MinStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        if(helper.peek()>x){
            helper.push(x);
        }


    }

    public void pop() {
        if(helper.peek().equals(data.peek())){
            helper.pop();
            data.pop();
        }else{
            data.pop();
        }
    }

    public int top() {
        return data.peek();
    }

    public int getMin() {
        return helper.peek();
    }
}
