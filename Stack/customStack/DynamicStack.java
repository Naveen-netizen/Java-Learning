package Stack.customStack;

public class DynamicStack extends customStack {
    public DynamicStack(int size) {
        super(size);
    }

    public DynamicStack() {
        super();
    }

    @Override
    public boolean push(int val) throws stackException {
        if (this.isFull()) {
            int[] temp = new int[2 * data.length];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(val);
    }

    public int pop() throws stackException {
        return super.pop();
    }
}
