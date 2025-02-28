public class BubbleSort {
    public static void main(String[] args) {
        sort(5, 0);
    }

    static void sort(int m, int r) {
        if (m < 0) {
            return;
        }
        if (r < m) {
            System.out.print("* ");
            sort(m, r + 1);
        } else {
            System.out.println();
            sort(m - 1, 0);
        }
    }
}
