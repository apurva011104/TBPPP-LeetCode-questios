class MinStack {
    class Node{
        int val;
        Node next;
        Node prev;
        int min;
        Node(int data,int min, Node prev){
            this.val=data;
            this.min=min;
            this.prev=prev;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    public MinStack() {
        this.head=null;
        this.tail=null;
    }
    
    public void push(int val) {
        if(head==null){
            head=new Node(val,val,null);
            tail=head;
        }
        else{
            tail.next=new Node(val,Math.min(val,tail.min),tail);
            tail=tail.next;
        }
    }
    
    public void pop() {
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            tail=tail.prev;
            tail.next=null;
        }
    }
    
    public int top() {
        return tail.val;
    }
    
    public int getMin() {
        return tail.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
