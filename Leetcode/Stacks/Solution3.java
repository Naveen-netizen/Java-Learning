package Leetcode.Stacks;

// https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/
public class Solution3 {
    public static void main(String[] args) {
        System.out.println(minInsertions("()()"));
    }

    public static int minInsertions(String s) {
        int res = 0;
        int need = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                need += 2;
                if (need % 2 != 0) {
                    res++;
                    need--;
                }
            } else {
                need--;
                if (need < 0) {
                    res++;
                    need = 1;
                }
            }
        }
        return res + need;
    }
}
