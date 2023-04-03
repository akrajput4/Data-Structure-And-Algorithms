package Recursion;

import java.util.Scanner;

public class ReverseTheNumber {
    public static int reverse(int n)
    {
        int count = 0 ;
         int a = n ;
       while(n>0)
       {
          count++;
          n = n/10;
       }
       int b = (int)Math.pow(10,count-1);
        System.out.println(b);
       int number = helper(a,b);
       return number;
    }

    public static int helper(int n , double length)
    {
        if(n<=0)
        {
            return 0;
        }
        int numb = (int) ((n%10)*length);
        numb = numb+helper(n/10,length/10);
        return numb ;
    }


    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        System.out.println(reverse(a));
    }

}
