public class Question155 {
 private Stack<Integer> minStack;
    private Stack<Integer> maxStack;
    public MinStack() {
        minStack = new Stack<>();
        maxStack = new Stack<>();

    }
    
    public void push(int val) {
          maxStack.push(val);
        if(minStack.isEmpty() || val <=minStack.peek()) {
            minStack.push(val);
        }
        
    }
    
    public void pop() {
         if (maxStack.isEmpty()) {
            return;
        }
        int removed = maxStack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
         return maxStack.peek();
        
    }
    
    public int getMin() {
         return minStack.peek();
        
    }
}
