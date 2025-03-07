package mar05;
public class Solution {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }

    public static String defangIPaddr(String address) {
        String ans = new String();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                ans = ans + "[.]";
            } else {
                ans = ans + address.charAt(i);
            }
        }
        return ans;
    }
}
