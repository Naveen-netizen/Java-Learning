package mar07;
import java.util.ArrayList;

public class PermutuationArr {
    public static void main(String[] args) {
        System.out.println(permutuation("", "abcdefgh"));
    }
    public static ArrayList<String> permutuation(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f= p.substring(0, i);
            String s=p.substring(i,p.length());
            ans.addAll(permutuation(f+ch+s, up.substring(1,up.length())));
        }
        return ans;
    }
}
