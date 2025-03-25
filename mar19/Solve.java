package mar19;
public class Solve {
    public static void main(String[] args) {
        System.out.println(myPow(1, 2147483647));
    }

    public static double myPow(double x, int n) {
        double ans = 1;
        if (n >= 0) {
            for (int i = 0; i < n; i++) {
                ans *= x;
            }
            return ans;
        } else {
            for (int i = 0; i < -n; i++) {
                ans *= x;
            }
            return 1 / ans;
        }

    }
}