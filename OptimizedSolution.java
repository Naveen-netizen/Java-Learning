import java.util.Stack;

public class OptimizedSolution {

    public static void main(String[] args) {
        int[] heights = { 2, 1, 2 };
        System.out.println(largestRectangleArea(heights));
    }

    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        stack.push(0);
        for (int i = 1; i < heights.length; i++) {
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]) {
                max = getMax(stack, heights, max, i);
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            max = getMax(stack, heights, max, heights.length);
        }
        return max;
    }

    private static int getMax(Stack<Integer> stack, int[] arr, int max, int i) {
        int area;
        int popped=stack.pop();
        if(stack.isEmpty()){
            area=arr[popped]*i;
        }
        else{
            area=arr[popped]*(i-1-stack.peek());
        }
        return area=Math.max(max,area);
    }
}
