import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                board[row][col] = ' ';
            }
        }

        char player = 'X';
        Scanner input = new Scanner(System.in);
        boolean gameOver = false;
        while (!gameOver) {
            print(board);
            System.out.print("Player " + player + " enter:");
            int row = input.nextInt();
            int col = input.nextInt();
            System.out.println();
            if (board[row][col] == ' ') {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if (gameOver) {
                    System.out.println("You have won");
                } else {
                    player = (player == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move.Try again");
            }
        }
    }

    public static boolean haveWon(char[][] board, char player) {
        // checking row
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // checking column
        for (int i = 0; i < board.length; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        // checking diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }

    public static void print(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                System.out.print(board[row][col]+"|");
            }
            System.out.println();
        }
    }
}
