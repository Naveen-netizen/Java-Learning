package mar10;
import java.util.ArrayList;

public class MazeArr {
    public static void main(String[] args) {
        
    }
    static ArrayList<String> path(String p,int row, int col){
        if(row==1&&col==1){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
        }
        ArrayList<String> list=new ArrayList<>();
        if(row>1){
            list.addAll(path(p+"D", row-1, col));
        }
        if(col>1){
            list.addAll(path(p+"R", row, col-1));
        }
        return list;
    }
}
