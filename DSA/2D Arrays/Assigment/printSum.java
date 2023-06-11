public class printSum {
    public static int sum(int matrix[][]) {
        int m = matrix[0].length;
        int sum = 0;
        
            for (int j = 0; j < m; j++) {
                sum+=matrix[1][j];
                return sum;
            }
            return sum; 
        }
       
    
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{2,3,4},{4,4,4}};
        System.out.println(sum(matrix));
    }
}
