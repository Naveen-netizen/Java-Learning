package feb22.Recursion;


public class SortedArray {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4 };

        System.out.println(isSorted(a, 0));
    }

    static boolean isSorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i] < arr[i + 1] & isSorted(arr, i + 1);
    }
}