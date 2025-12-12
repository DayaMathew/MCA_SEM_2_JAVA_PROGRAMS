import java.util.Scanner;
import java.util.Random;

public class prgm9 {

    private static final int SIZE = 4;           // 4x4 grid
    private static int[][] board = new int[SIZE][SIZE];
    private static int emptyRow, emptyCol;       // position of empty space

    // 1. Initialize the board in solved order
    public static void initializeBoard() {
        int num = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == SIZE - 1 && j == SIZE - 1) {
                    board[i][j] = 0;             // empty space
                    emptyRow = i;
                    emptyCol = j;
                } else {
                    board[i][j] = num++;
                }
            }
        }
    }

    // 2. Display the board
    public static void displayBoard() {
        System.out.println("\n+----+----+----+----+");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0)
                    System.out.print("    |");
                else
                    System.out.printf(" %2d |", board[i][j]);
            }
            System.out.println("\n+----+----+----+----+");
        }
    }

    // 3. Shuffle the board by making random moves
    public static void shuffleBoard(int moves) {
        Random rand = new Random();
        char[] directions = {'W', 'A', 'S', 'D'};  // Up, Left, Down, Right

        for (int i = 0; i < moves; i++) {
            moveTile(directions[rand.nextInt(4)], false); // false = don't print
        }
    }

    // 4. Move the tile in the specified direction
    public static boolean moveTile(char dir, boolean display) {
        int newRow = emptyRow;
        int newCol = emptyCol;

        switch (Character.toUpperCase(dir)) {
            case 'W': newRow = emptyRow - 1; break; // move empty up
            case 'S': newRow = emptyRow + 1; break; // move empty down
            case 'A': newCol = emptyCol - 1; break; // move empty left
            case 'D': newCol = emptyCol + 1; break; // move empty right
            default:
                if (display) System.out.println("Invalid input! Use W/A/S/D.");
                return false;
        }

        // Check if new position is valid
        if (newRow >= 0 && newRow < SIZE && newCol >= 0 && newCol < SIZE) {
            // Swap tile with empty space
            board[emptyRow][emptyCol] = board[newRow][newCol];
            board[newRow][newCol] = 0;
            emptyRow = newRow;
            emptyCol = newCol;
            return true;
        } else {
            if (display) System.out.println("Can't move in that direction!");
            return false;
        }
    }

    // 5. Check if the puzzle is solved
    public static boolean isSolved() {
        int num = 1;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == SIZE - 1 && j == SIZE - 1) return board[i][j] == 0;
                if (board[i][j] != num++) return false;
            }
        }
        return true;
    }

    // 6. Main game loop
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 15-PUZZLE GAME ===");
        System.out.println("Goal: Arrange tiles in ascending order (1-15)");
        System.out.println("Controls: W=Up, S=Down, A=Left, D=Right, Q=Quit");

        initializeBoard();

        System.out.print("\nEnter number of shuffle moves (20-50 recommended): ");
        int shuffleMoves = sc.nextInt();
        shuffleBoard(shuffleMoves);

        int moveCount = 0;

        while (!isSolved()) {
            displayBoard();
            System.out.println("Moves made: " + moveCount);
            System.out.print("Enter move (W/A/S/D) or Q to quit: ");
            String input = sc.next();

            if (input.equalsIgnoreCase("Q")) {
                System.out.println("Game quit. Thanks for playing!");
                break;
            }

            if (input.length() > 0 && moveTile(input.charAt(0), true)) {
                moveCount++;
            }
        }

        if (isSolved()) {
            displayBoard();
            System.out.println("\n*** CONGRATULATIONS! ***");
            System.out.println("You solved the puzzle in " + moveCount + " moves!");
        }

        sc.close();
    }
}
