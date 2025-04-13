package Queue.customQueue;

import java.util.LinkedList;

public class customQueue {
    private LinkedList<Integer> Data;

    public void push(int val) {
        Data.add(val);
    }

    public void pop() {
        Data.removeFirst();
    }

    public customQueue() {
        this.Data = new LinkedList<>();
    }
    public void display(){
        System.out.println(Data);
    }
}
