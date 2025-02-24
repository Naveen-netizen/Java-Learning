import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        sort2(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
// bruteforce approach
    static void sort(int[] arr, int s, int pointer, int max) {
        if (s == 0) {
            return;
        }
        if (pointer < s) {
            if (arr[pointer] > max) {
                max = arr[pointer];
                // swap
                int temp = arr[s];
                arr[s] = max;
                arr[pointer] = temp;
                sort(arr, s, pointer, max);
            } else {
                sort(arr, s, pointer + 1, max);
            }
        } else {
            sort(arr, s - 1, 0, 0);
        }

    }
    // efficient way

    static void sort2(int[] arr,int len,int pointer,int maxIndex){
        if(len==1){
            return;
        }
        if(pointer<len){
            if(arr[pointer]>arr[maxIndex]){
                maxIndex=pointer;
            }
            sort2(arr, len, pointer+1, maxIndex);
        }
        else{
            int temp=arr[len-1];
            arr[len-1]=arr[maxIndex];
            arr[maxIndex]=temp;
            sort2(arr, len-1, 0, 0);
        }
    }
}
