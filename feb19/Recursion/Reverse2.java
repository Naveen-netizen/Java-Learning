package feb19.Recursion;

public class Reverse2 {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    static int reverse(int n) {
        int digit = (int) (Math.log10(n) + 1);
        int ans = 0;
        for (int index = digit; index > 0; index--) {
            int rem = n % 10;
            ans += rem * (int) Math.pow(10, index - 1);
            n = n / 10;
        }
        return ans;
    }
}
