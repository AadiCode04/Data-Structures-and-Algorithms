package twoDArrays.PracticeQuestions;

public class Question3 {
    public static void main(String[] args) {

        int row = 2, column = 3;

        int[][] matrix = {
            {2, 3, 7},
            {5, 6, 9}
        };

        // Print original matrix
        printMatrix(matrix);

        // Transpose matrix (size becomes column x row)
        int[][] transpose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print transposed matrix
        printMatrix(transpose);
    }

    // Function to print matrix
    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
