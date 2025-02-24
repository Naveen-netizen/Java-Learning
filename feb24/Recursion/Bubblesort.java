import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 63, 1, 6, 7, 8 };
        sort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int a, int b) {
        if (a == 0) {
            return;
        }
        if (b < a) {
            if (arr[b] > arr[b + 1]) {
                swap(arr, b, b + 1);
                sort(arr, a, b + 1);
            } else {
                sort(arr, a, b + 1);
            }
        } else {
            sort(arr, a - 1, 0);
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
