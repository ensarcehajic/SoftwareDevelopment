import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    char [] [] board = new char [3][3];
    for(int i=0; i<3; i++){
        board[i][0]='-';
        board[i][1]='-';
        board[i][2]='-';
    }
    boolean player = true;
    char symb;
    int row, column;
    Scanner s = new Scanner(System.in);

    while(true){
    printBoard(board);
    if(player){
        symb = 'X';
    }else {
        symb = 'O';
    }
    do {
        System.out.println("Player " + symb + " is playing!");
        System.out.println("Enter row number (0-2): ");
        row = s.nextInt();
        System.out.println("Enter column number (0-2): ");
        column = s.nextInt();
    } while (row < 0 || row >= 3 || column < 0 || column >= 3 || board[row][column] != '-');
        board[row][column]=symb;
        char winner = checkWinner(board);
        
        if (isBoardFull(board)) {
            printBoard(board);
            System.out.println("It's a draw!");
            break;
        }
        
    if (winner != '-') {
        printBoard(board);
        System.out.println("Player " + winner + " wins!");
        break;
    }

        player = !player;
    }

    }

    public static char checkWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != '-' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
                return board[i][0];
    
            if (board[0][i] != '-' && board[0][i] == board[1][i] && board[1][i] == board[2][i])
                return board[0][i];
        }
    
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2])
            return board[0][0];
    
        if (board[0][2] != '-' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
            return board[0][2];
        
        return '-';
    }

    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false; 
                }
            }
        }
        return true; 
    }
    
    
    public static void printBoard(char [][] board){
        System.out.println("-------------");
        for(int i = 0; i < 3; ++i){
            for(int j=0; j < 3; ++j){
            System.out.print("| "+board[i][j]+" ");
            }
            System.err.println("|");
            System.out.println("-------------");
        }
    }
}
