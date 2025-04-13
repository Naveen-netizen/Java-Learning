package Stack.customStack;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public customStack(int size) {
        this.data = new int[size];
    }

    public customStack() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public boolean push(int val) throws stackException {
        if (isFull()) {
            throw new stackException("The stack is full");
        }
        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws stackException {
        if (isEmpty()) {
            throw new stackException("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }

    public int peak() throws stackException{
        if (isEmpty()) {
            throw new stackException("Cannot peak from an empty stack");
        }
        return data[ptr];
    }
}
