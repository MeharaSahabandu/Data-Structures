package Queue;

public class QueueApp {

    public static  void main (String[] args){

        QueueX theQueue = new QueueX(5);
        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);

        theQueue.remove();

        theQueue.insert(40);

        theQueue.remove();

        theQueue.peekFront();


    }


    
}
