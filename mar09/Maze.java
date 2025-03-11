public class Maze {
    public static void main(String[] args) {
        count("", 3, 3);
    }

    static void count(String p, int row, int col) {
        if (row == 1 && col == 1) {
            System.out.println(p);
            return;
        }
        if (col > 1) {
            count(p + "R", row, col - 1);
        }
        if (row > 1) {
            count(p + "D", row - 1, col);
        }
    }
}