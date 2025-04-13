package Leetcode.Stacks;

import java.util.Stack;

public class Solution2 {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid(")))"));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && ch == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }
}
