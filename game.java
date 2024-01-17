import java.util.Scanner;

public class game {
    private static char[][] b = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    private static char Player = 'X';

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Board();
            System.out.println("Player " + Player + ", enter your move (row and column): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (Mov(row, col)) {
                b[row][col] = Player;
                if (IsWin()) {
                    Board();
                    System.out.println("Player " + Player + " wins!");
                    break;
                } else if (Gameover()) {
                    Board();
                    System.out.println("It's a tie!");
                    break;
                }
                Next();
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        sc.close();
    }

    private static void Board() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
    }

    private static boolean Mov(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && b[row][col] == ' ';
    }

    private static void Next() {
        Player = (Player == 'X') ? 'O' : 'X';
    }
    

    private static boolean IsWin() {
        
        for (int i = 0; i < 3; i++) {
            if (b[i][0] == Player && b[i][1] == Player && b[i][2] == Player ||
                    b[0][i] == Player && b[1][i] == Player && b[2][i] == Player) {
                return true;
            }
        }
        return b[0][0] == Player && b[1][1] == Player && b[2][2] == Player ||
                b[0][2] == Player && b[1][1] == Player && b[2][0] == Player;
    }

    private static boolean Gameover() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (b[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

