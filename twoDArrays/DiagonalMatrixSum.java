package twoDArrays;

public class DiagonalMatrixSum {

    public static int diagonalSum(int matrix[][]){
        int primarysum = 0 ;
        int secondarysum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i==j) {
                    primarysum = primarysum + matrix[i][j];
                }
                
            }
        }

        int i = 0 ;
        int j = matrix[0].length - 1;
        while ( i < matrix.length  && j >=0 ) {
            secondarysum = secondarysum + matrix[i][j];
            i++;
            j--;
        }

        return primarysum+ secondarysum;
    }
    
    public static void main(String[] args) {
        
        int matrix[][] = { {1 , 2, 3, 4} ,
                         {5 ,6 ,7 ,8, } ,
                            {9 , 10 ,11 ,12},
                             { 13, 14 , 15, 16} };

        diagonalSum(matrix);
        System.out.println(diagonalSum(matrix));
        
    }
}
