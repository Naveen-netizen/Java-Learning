package mar10;
public class MazeCount {
    public static void main(String[] args) {
        System.out.println(count(2,2));
    }
    static int count(int row,int col){
        if(row==1||col==1){
            return 1;
        }
        int left=count(row, col-1);
        int down=count(row-1, col);
        return left+down;
    }
}
