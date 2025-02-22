package feb22.Recursion;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 4 };
        int target = 4;
        System.out.println(multipleOccurances2(a, target, 0));
    }

    static int search(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return search(arr, target, i + 1);
        }

    }

    static ArrayList<Integer> multipleOccurances(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        return multipleOccurances(arr, target, i + 1, list);
    }

    // multiple occurances without passing Arraylist as Argument

    static ArrayList<Integer> multipleOccurances2(int[] arr, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        ArrayList<Integer> list2 = multipleOccurances2(arr, target, i + 1);
        list.addAll(list2);
        return list;
    }
}
