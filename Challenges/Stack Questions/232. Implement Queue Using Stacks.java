class MyQueue {
    Stack<Integer> queue;

    public MyQueue() {
        queue=new Stack<>();
    }
    
    public void push(int val) {
        queue.push(val);
    }
    
    public int pop()  {
        Stack <Integer> helper=new Stack<>();
        while(!queue.isEmpty()){
            helper.push(queue.pop());
        }
        int display=helper.pop();
        while(!helper.isEmpty())
            queue.push(helper.pop());
        return display;
    }
    
    public int peek() {
        Stack <Integer> helper=new Stack<>();
        while(!queue.isEmpty()){
            helper.push(queue.pop());
        }
        int pri=helper.peek();
        while(!helper.isEmpty())
            queue.push(helper.pop());
        return pri;
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
