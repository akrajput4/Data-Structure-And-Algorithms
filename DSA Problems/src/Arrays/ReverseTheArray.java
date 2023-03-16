package Arrays;

import java.util.Scanner;

public class ReverseTheArray {

    public static void reverseArray(int[] arr)
    {
       for(int i = arr.length-1;i>=0;i--)
       {
           System.out.println(arr[i]);
       }
    }

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        int[] arr = new int[a];
        for(int i=0;i< arr.length;i++)
        {
            arr[i] = sca.nextInt();
        }
         reverseArray(arr);

    }
}
