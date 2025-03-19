package mar12;
import java.util.Arrays;

public class Backtracking {
    public static void main(String[] args) {
        boolean[][] board={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path=new int[board.length][board[0].length];
        pathTracking("", board, 0, 0, path, 1);

    }

    static void pathTracking(String p, boolean[][] maze, int row, int col,int[][] path,int step){
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            for (int[] arr : path) {
                path[row][col]=step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) {
            return;
        }
        maze[row][col] = false;
        path[row][col]=step;
        if (col < maze[0].length - 1) {

            pathTracking(p+"R",maze, row,col+1,path, step+1);
        }
        if (col > 0) {

            pathTracking(p+"L",maze, row,col-1,path, step+1);
        }
        if (row > 0) {

            pathTracking(p+"U",maze,row-1, col,path, step+1);
        }
        if (row < maze.length - 1) {

            pathTracking(p+"D", maze, row+1, col,path,step+1);
        }
        maze[row][col] = true;
        path[row][col]=0;
    }
}
