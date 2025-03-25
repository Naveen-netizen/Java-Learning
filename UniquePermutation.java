import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class UniquePermutation{
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> result = permutation(arr);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
    public static List<List<Integer>> permutation(int[] arr){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        helper(arr,new boolean[arr.length],new ArrayList<>(),result);
        return result;

}
private static void helper(int[] arr,boolean[] used,List<Integer> current,List<List<Integer>> result){
    if(current.size()==arr.length){
        result.add(new ArrayList<>(current));
        return;
    }
    for (int i = 0; i < used.length; i++) {
        if(used[i]) continue;
        if(i>0 && arr[i]==arr[i-1] && !used[i-1]){
            continue;
        }
        used[i]=true;
        current.add(arr[i]);
        helper(arr, used, current, result);
        current.remove(current.size()-1);
        used[i]=false;
    }
    
}
}