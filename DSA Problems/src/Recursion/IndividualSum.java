package Recursion;

import java.util.Scanner;

public class IndividualSum {

    public static int individualSum(int n)
    {
        if(n==0)
        {
            return 0;
        }
       int sum = 0 ;
        sum = sum + n%10 + individualSum(n/10);
        return sum ;
    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        System.out.println(individualSum(a));
    }
}
