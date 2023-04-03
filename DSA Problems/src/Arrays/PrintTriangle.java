package Arrays;

import java.util.Scanner;

public class PrintTriangle {

    public static void print(int arr[][]) {

// Lower Triangle

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }

//Upper Triangle
        System.out.println(  );
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i > j) {
                    System.out.print(" "+" ");
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

       // Scanner sca = new Scanner(System.in);
        int[][] arr = {{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}};
        print(arr);


    }
}
