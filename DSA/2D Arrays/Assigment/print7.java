// Print the number of 7’s that are inthe 2d array
public class print7{
    public static int search(int matrix[][], int key) {
        int n = matrix.length;
        int counter = 0;
        int m= matrix[0].length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(matrix[i][j]==key){
                    counter++;
                }
            }
           
        }
        
         return counter;
    }
    public static void main(String[] args) {
        int matrix[][] = {{4,7,8},
                        {8,8,7}};
        int key = 7;
        System.out.println(search(matrix, key));
         
    }
}