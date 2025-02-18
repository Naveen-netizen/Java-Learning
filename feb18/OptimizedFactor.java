package feb18;

import java.util.ArrayList;

public class OptimizedFactor {
    public static void main(String[] args) {
        int n = 40;
        factorOfNum(n);
    }

    static void factorOfNum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    list.add(n / i);
                }
            }

        }
        for (int index = list.size() - 1; index >= 0; index--) {
            System.out.print(list.get(index) + " ");
        }
    }
}
