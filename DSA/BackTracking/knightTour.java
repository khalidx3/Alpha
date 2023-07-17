public class knightTour{
    public static void knigth(int chess[][],int row, int col,int move){
        if(row<0 || col<0 || row>=chess.length || col>=chess.length || chess[row][col]>0){
            return;
        }else if(move==chess.length*chess.length){
            chess[row][col]=move;
            printBoard(chess);
            chess[row][col]=0;
            return;
        }
        chess[row][col]=move;
        knigth(chess, row-2, col+1, move+1);
        knigth(chess, row-1, col+2, move+1);
        knigth(chess, row+1, col+1, move+1);
        knigth(chess, row+2, col+2, move+1);
        knigth(chess, row+2, col-1, move+1);
        knigth(chess, row+1, col-2, move+1);
        knigth(chess, row-1, col-2, move+1);
        knigth(chess, row-2, col-1, move+1);
        chess[row][col]=0;
    }
    public static void printBoard(int board[][]){
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
                
            }
            System.out.println();
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 5;
        int board[][] =  new int[n][n];
        knigth(board, 2, 3, 1);
        
    
    }
}