class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> min;
    public int minval;
    
    public MinStack() {
        stack = new Stack<Integer>();
        min = new Stack<Integer>();
        minval = Integer.MAX_VALUE;
    }
    
    public void push(int x) {
        stack.push(x);
        if (x < minval) {
            minval = x;
        } 
        min.push(minval);
    }

    public void pop() {
        if (stack.isEmpty()) return;
        stack.pop();
        int min_top = min.pop();
        if (stack.isEmpty()) {
            minval = Integer.MAX_VALUE;
        } else if (min_top == minval) {
            minval = min.peek();
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    public int getMin() {
        if (min.isEmpty()) return -1;
        return min.peek();
    }
}

