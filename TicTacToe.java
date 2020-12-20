import java.util.Scanner;

public class TicTacToe {
    public static char[] createBoard() {
        char[] board = new char[10];
        for (int i = 0; i < board.length; i++) {
            board[i] = ' '; //initializing empty values
        }
        return board;
    }
    public static char chooseUserLetter(Scanner userInput) {
        System.out.println("Choose Your Letter X or O: ");
        return userInput.next().toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        Scanner userInput = new Scanner(System.in);
        char[] board = createBoard();
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
    }
}
