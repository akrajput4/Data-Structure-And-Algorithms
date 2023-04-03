package Recursion;

import java.util.Scanner;

public class Factorial {


    public static int fact(int n)
    {
        if (n==1)
        {
            return 1 ;
        }
        int fcat = 1;
        fcat = n*fact(n-1);
        return fcat;
    }


    public static void main(String[] args) {
       Scanner  sca = new Scanner(System.in);
       int a = sca.nextInt();

        System.out.println( fact(a));

    }
}
