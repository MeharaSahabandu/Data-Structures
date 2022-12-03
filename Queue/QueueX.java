package Queue;

public class QueueX {

    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;


    public QueueX(int s) {
        maxSize = s;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }


    //insert method
    public void insert(int j) {
        if(isFull()) {
            System.out.println("Queue is full");
        } else {
            if(rear == maxSize - 1) {
                rear = -1;
            }
            queueArray[++rear] = j;
            nItems++;
        }
        queueArray[++rear] = j;
        nItems++;
    }


    //remove method
    public int remove() {
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        } else {
            int temp = queueArray[front++];
            if(front == maxSize) {
                front = 0;
            }
            nItems--;
            return temp;
        }
    }

    //peek method
    public int peekFront() {
        return queueArray[front];
    }


    //isEmpty method
    public boolean isEmpty() {
        return (nItems == 0);
    }

    //isFull method
    public boolean isFull() {
        return (nItems == maxSize);
    }
    
}
