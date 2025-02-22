package feb22;

public class ReversedArray {
    public static void main(String[] args) {
     int[] a={5,1,4};
     int target=5 ;
     System.out.println(search(a, target, 0, a.length-1));
    }

    static int search(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] < arr[mid]) {
            if ((arr[mid] < target) || (arr[start] > target)) {
                return search(arr, target, mid + 1, end);
            } else {
                return search(arr, target, start, mid - 1);
            }
        } else {
            if (arr[mid] < target && arr[start] > target) {
                return search(arr, target, mid + 1, end);
            } else {
                return search(arr, target, start, mid - 1);
            }
        }
    }
}
