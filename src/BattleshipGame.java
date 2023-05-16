import java.util.Scanner;
public class BattleshipGame {
    public static void main(String[] args) {
        int[][] board = new int[5][5];
        int numShips = 3;
        int shipsSunk = 0;

        placeShips(board, numShips);

        while (shipsSunk < numShips) {
            int[] guess = getGuess();
            int row = guess[0];
            int col = guess[1];

            if (board[row][col] == 1) {
                System.out.println("You sunk a ship!");
                board[row][col] = 2;
                shipsSunk++;
            } else if (board[row][col] == 0) {
                System.out.println("You missed!");
                board[row][col] = 3;
            } else if (board[row][col] == 2) {
                System.out.println("You already sunk that ship!");
            } else if (board[row][col] == 3) {
                System.out.println("You already missed there!");
            }
        }

        System.out.println("You won!");
    }

    public static void placeShips(int[][] board, int numShips) {
        int count = 0;

        while (count < numShips) {
            int row = (int) (Math.random() * 5);
            int col = (int) (Math.random() * 5);

            if (board[row][col] == 0) {
                board[row][col] = 1;
                count++;
            }
        }
    }

    public static int[] getGuess() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row number (0-4): ");
        int row = input.nextInt();
        System.out.print("Enter a column number (0-4): ");
        int col = input.nextInt();

        int[] guess = new int[2];
        guess[0] = row;
        guess[1] = col;
        return guess;
    }
}
