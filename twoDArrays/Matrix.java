package twoDArrays;

import java.util.*;
import java.util.Scanner;

public class Matrix {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3 ;
        int m = 3 ;
        int matrix[][]  = new int[3][3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j]= sc.nextInt();
            }
        }

        System.out.println("Matrix is : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" "+ matrix[i][j]) ;
            }
            System.out.println();
        }



    }
}
