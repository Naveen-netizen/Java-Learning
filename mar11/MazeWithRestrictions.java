package mar11;
public class MazeWithRestrictions {
    public static void main(String[] args) {
        boolean[][] maze = {
                { true, false, true },
                { true, true, true },
                { true, true, true }
        };
        count("", maze, 0, 0);
    }

    static void count(String p, boolean[][] maze, int row, int col) {
        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!maze[row][col]) {
            return;
        }

        if (col < maze[0].length - 1) {
            count(p + "R", maze, row, col + 1);
        }
        if (row < maze.length - 1) {
            count(p + "D", maze, row + 1, col);
        }
    }
}
