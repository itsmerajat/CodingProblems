package Array;

public class TicTacToeWinner {
    public static String tictactoe(int[][] moves) {
        int[][] game = new int[3][3];

        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0) {
                game[moves[i][0]][moves[i][1]] = 1;
                if (isWinnerMove(game, moves[i], "A")) {
                    return "A";
                }
            } else {
                game[moves[i][0]][moves[i][1]] = -1;
                if (isWinnerMove(game, moves[i], "B")) {
                    return "B";
                }
            }
        }
        if (moves.length == 9) {
            return "Draw";
        } else {
            return "Pending";
        }
    }

    public static boolean isWinnerMove(int[][] game, int[] move, String player) {
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += game[move[0]][i];
        }
        if (sum == 3 || sum == -3)
            return true;
        sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += game[i][move[1]];
        }
        if (sum == 3 || sum == -3)
            return true;
        if (game[1][1] != 0) {
            if (game[0][0] + game[1][1] + game[2][2] == 3 || game[0][0] + game[1][1] + game[2][2] == -3
                    || game[0][2] + game[1][1] + game[2][0] == 3 || game[0][2] + game[1][1] + game[2][0] == -3)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] game = new int[6][2];

        game[0] = new int[] { 0, 0 };
        game[1] = new int[] { 1, 1 };
        game[2] = new int[] { 0, 1 };
        game[3] = new int[] { 0, 2 };
        game[4] = new int[] { 1, 0 };
        game[5] = new int[] { 2, 0 };

        System.out.println(tictactoe(game));
    }
}