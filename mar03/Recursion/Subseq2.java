package mar03.Recursion;

import java.util.ArrayList;

public class Subseq2 {
    public static void main(String[] args) {
        System.out.println(seq("", "abc"));
    }

    static ArrayList<String> seq(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add(p);
            return ans;
        }
        
        char ch = up.charAt(0);
        ArrayList<String> right = seq(p + ch, up.substring(1));
        ArrayList<String> left = seq(p, up.substring(1));
        right.addAll(left);
        return right;
    }
}
