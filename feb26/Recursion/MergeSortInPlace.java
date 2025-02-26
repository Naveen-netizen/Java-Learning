package feb26.Recursion;
import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 1, 2, 3};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int start, int end) {
        if (start >= end) { // Fix base case condition
            return;
        }
        int mid = start + (end - start) / 2;
        sort(arr, start, mid);
        sort(arr, mid + 1, end); // Fix division
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start + 1]; // Fix array size
        int i = start;
        int j = mid + 1; // Fix indexing
        int k = 0;

        while (i <= mid && j <= end) { // Fix condition (should use <=)
            if (arr[i] <= arr[j]) { // Fix comparison (stable sort)
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) { // Copy remaining elements from left half
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j <= end) { // Copy remaining elements from right half
            mix[k] = arr[j];
            j++;
            k++;
        }

        // Copy sorted elements back to the original array
        for (int k2 = 0; k2 < mix.length; k2++) {
            arr[start + k2] = mix[k2];
        }
    }
}
