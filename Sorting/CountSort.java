package Sorting;

import java.security.PublicKey;

public class CountSort {

    public static void countingsort(int arr[]){
        int largesst = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largesst = Math.max(largesst, arr[i]);
        }

        int count[] = new int[largesst+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0 ;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0 ) {
                arr[j ]= i ;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1 , 4 ,1 ,3 ,2, 4 ,3 ,7};
        countingsort(arr);
        printArr(arr);
    }
}
