package feb18;

import java.util.ArrayList;

public class PrimeNosInRange {
    public static void main(String[] args) {
        int num = 40;
        System.out.println(PrimeInRange(num));
    }

    static ArrayList<Integer> PrimeInRange(int n) {
        ArrayList<Integer> PrimeNos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                PrimeNos.add(i);
            }
        }
        return PrimeNos;
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
