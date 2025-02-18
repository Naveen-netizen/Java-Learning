package feb18;

public class Prime {
    public static void main(String[] args) {
        int n = 13;
        boolean ans = findPrime(n);
        System.out.println(ans);
    }

    static boolean findPrime(int num) {
        for (int index = 2; index < num; index++) {
            if (num % index == 0) {
                return false;
            }
        }
        return true;
    }

}