import static java.awt.SystemColor.text;

public class Main {
    private static final int BOARD_SIZE = 8;

    // this is just my approach, so this problem can be solved in better way
    public static void main(String[] args) {
        String[] pieces = {"Rook", "Knight", "Bishop", "Queen", "King"};
        String[][] board = new String[BOARD_SIZE][BOARD_SIZE];

        // loop to iterate through each row of the board
        for (int i = 0; i < BOARD_SIZE; i++) {
            // filter first (0) row or last (BOARD_SIZE - 1) row of the board
            if (i == 0 || i == BOARD_SIZE - 1) {
                // pointer to iterate from the row start
                int leftPointer = 0;
                // pointer to iterate from the row ending
                int rightPointer = BOARD_SIZE - 1;
                // while they are not equal (to prevent pointer overlapping)
                while (leftPointer <= rightPointer) {
                    // leftPointer can be used as iterator of pieces array as well
                    // leftPointer is used to retrieve piece and place it on the index of the leftPointer
                    // {"Rook", "Knight", "Bishop", "Queen", "King"}
                    // in array, they are placed as they would be placed on the board

                    board[i][leftPointer] = pieces[leftPointer];

                    if (rightPointer == BOARD_SIZE / 2) {
                        board[i][rightPointer] = pieces[rightPointer];
                    } else {
                        board[i][rightPointer] = pieces[leftPointer];
                    }
                    leftPointer++;
                    rightPointer--;
                }
            } else if (i == 1 || i == BOARD_SIZE - 2) {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    board[i][j] = "Pawn";
                }
            } else {
                for (int j = 0; j < BOARD_SIZE; j++) {
                    board[i][j] = "";
                }
            }
        }

        // display the board with populated pieces
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.printf("%6s ", board[i][j]);
            }
            System.out.println();
        }
    }
}
