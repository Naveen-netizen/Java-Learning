package feb19.Recursion;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(1200));
    }

    static int reverse(int a) {
        int digits = (int) (Math.log10(a) + 1);
        return helper(a, digits);
    }

    static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        n = n / 10;
        return (rem *(int) (Math.pow(10, digit - 1)) + helper(n, digit - 1));
    }
}
