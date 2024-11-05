class MyStack {
    Queue <Integer> queue;
    int length=0;
    public MyStack() {
        queue=new LinkedList<>();
    }
    
    public void push(int x) {
        queue.add(x);
        length++;
    }
    
    public int pop() {
        int len=length;
        for(int i=0;i<len-1;i++){
            queue.add(queue.remove());
        }
        int x=queue.remove();
        length--;
        return x;
    }
    
    public int top() {
        int len=length;
        for(int i=0;i<len-1;i++){
            queue.add(queue.remove());
        }
        int x=queue.remove();
        queue.add(x);
        return x;
    }
    
    public boolean empty() {
        return length==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
