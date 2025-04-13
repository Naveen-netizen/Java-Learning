package Queue.customQueue;

public class queueMain {
    public static void main(String[] args) {
        customQueue queue=new customQueue();
        for (int i = 0; i < 5; i++) {
            queue.push(i);
        }
        queue.display();
        for (int i = 0; i < 3; i++) {
            queue.pop();
        }
        queue.display();
    }
}
