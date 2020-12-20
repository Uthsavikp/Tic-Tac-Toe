import java.util.Scanner;
import java.util.Arrays;

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

    public static void showBoard(char[] board) {
        System.out.println("|-----------|");
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
        System.out.println("|-----------|");
    }

    public static int getUserMove(char[] board,Scanner userInput){
        Integer [] validCells={1,2,3,4,5,6,7,8,9};
        while (true){
            System.out.println("what is your next move?(1-9): ");
            int index=userInput.nextInt();
            if(Arrays.asList(validCells).contains(index) && isSpaceFree(board,index) );
            return index;
        }
    }
    public static boolean isSpaceFree(char[] board ,int index) {
        return board[index] == ' ';
    }

    public static void makeMove(char[] board, int index, char letter){
        boolean spaceFree = isSpaceFree(board, index);
        if (spaceFree) board[index] = letter;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        Scanner userInput = new Scanner(System.in);
        char[] board = createBoard();
        char userLetter = chooseUserLetter(userInput);
        char computerLetter = (userLetter == 'X') ? 'O' : 'X';
        showBoard(board);
        int userMove = getUserMove(board, userInput);
        makeMove(board, userMove, userLetter);
        showBoard(board);
    }
}
