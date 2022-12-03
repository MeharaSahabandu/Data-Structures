public class StackX {

    private int maxSize;
    private int[] stackArray;
    private int top;

    //constructor
    public StackX(int s) {
        maxSize = s;
        stackArray = new int[maxSize];
        top = -1;
    }

    //push method
    public void push(int j) {
        if(isFull()) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = j;
        }

        }
    

    //pop method
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    //peek method
    public int peek() {
        return stackArray[top];
    }

    //isEmpty method
    public boolean isEmpty() {
        return (top == -1);
    }

    //isFull method
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
}
