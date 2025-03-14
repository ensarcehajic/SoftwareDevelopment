public class App {
    public static void main(String[] args) throws Exception {
    int [] [] board = new int[3][3];
    printBoard(board);
    }


    
    public static void printBoard(int [][] board){
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
