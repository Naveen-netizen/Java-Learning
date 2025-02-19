package feb19;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(digitSum(1234));
    }

    public static int digitSum(int n) {
        if (n % 10==n) {
            return n;
        }
        int rem = n % 10;
        n = n / 10;
        return rem + digitSum(n);
    }
}
