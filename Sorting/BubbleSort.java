package Sorting;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class BubbleSort {

    public static void bubblesort(int arr[]){
        for (int turn = 0; turn < arr.length-1 ; turn++) {
            for (int i = 0; i < arr.length-1-turn; i++) {
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                }
            }   
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( " " + arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        int arr[] = new int[4];

        for (int i = 0; i <4; i++) {
            arr[i] = sc.nextInt();
        }

        for (int j = 0; j < 4; j++) {

            System.out.print(" "+ arr[j]);
        }
        System.out.println();

        bubblesort(arr);
        printArr(arr);

    }
}
