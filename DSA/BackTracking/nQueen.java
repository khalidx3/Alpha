public class nQueen{
    public static boolean isSafe(char board[][],int row, int col){
        //vertical
        for(int i = row-1; i >=0; i--) {
            if(board[i][col] =='Q'){
                return false;
            }
            
        }
        //diagonal left
        for(int i = row-1, j = col-1;i>=0 && j>=0;i--,j--){
             if(board[i][j] =='Q'){
                return false;
            }

        }
        //diagonal right
        for(int i = row-1,j=col+1;i>=0&&j<board.length;i--,j++){
             if(board[i][j] =='Q'){
                return false;
            }
        }
        return true;
    }
    public static void Nqueen(char board[][],int row){
        //base
        if(row==board.length){
            printBoard(board);
            count++;
            
            return;
        }
        // collumn loop
        for(int i =0;i<board.length;i++){
            if(isSafe(board, row, i)){
                board[row][i]='Q';
                Nqueen(board, row+1); //function call
                board[row][i]='X';
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]+" ");
                
            }
            System.out.println();
            
        }
    }
    static int count =0;
    public static void main(String[] args) {
        int n = 4;
        char board[][] =  new char [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='X';
            }
            
        }
        Nqueen(board, 0);
        System.out.println("total ways = "+count);
    }
}