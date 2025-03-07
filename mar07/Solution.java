package mar07;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = letterCombinations("78");
        System.out.println(list);
    }

    public static List<String> letterCombinations(String up) {
        List<String> list = new ArrayList<>();
        list = letterCombinations1("", up);
        return list;
    }

    public static List<String> letterCombinations1(String p, String up) {
        if (up.isEmpty()) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';

        List<String> ans = new ArrayList<>();

        int start = (digit - 2) * 3;

        int end = (digit - 1) * 3;

        if (digit == 7)
            end++;

        if (digit == 8) {
            start++;
            end++;
        }

        if (digit == 9) {
            start++;
            end += 2;
        }

        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(letterCombinations1(p + ch, up.substring(1)));
        }

        return ans;
    }
}