class MinStack {
    LinkedList<Integer> stack;
    LinkedList<Integer> minStack;
    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }
    
    public void push(int val) {
        stack.addFirst(val);
        if(minStack.isEmpty()||val<=minStack.getFirst())
        {
            minStack.addFirst(val);
        }  
    }
    
    public void pop() {
            if(stack.getFirst().equals(minStack.getFirst()))
            {
                minStack.removeFirst();
            }
            stack.removeFirst();
    }
    
    public int top() {
        return stack.getFirst();
    }
    
    public int getMin() {
        return minStack.getFirst();
    }
}
