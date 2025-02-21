package feb19.Recursion;

public class Palindrome {

    public static void main(String[] args) {
        int n = 010;
        System.out.println(ispalindrome(n));
    }

    static boolean ispalindrome(int n) {
        int rev = reverse(n);
        return n == rev;
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
        return (rem * (int) (Math.pow(10, digit - 1)) + helper(n, digit - 1));
    }
}
