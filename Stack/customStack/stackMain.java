package Stack.customStack;

public class stackMain {
    public static void main(String[] args) throws Exception {
        DynamicStack stack=new DynamicStack(5);
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 11; i++) {
            System.out.println(stack.pop());
        }
    }
}
