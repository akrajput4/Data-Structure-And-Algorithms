package Basic;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void checkArmstrong(int n)
    {
        int a = n ;
        int b =n;
        int power=0;
        while(b>0)
        {
            power+=1;
            b=b/10;
        }
        int sum =0 ;
        while(n>0)
        {
            int c = n%10;
            sum+=Math.pow(c,power);
            n=n/10;
        }

        if(a==sum)
        {
            System.out.println("Yes It is Armstrong Number");
        }
        else
            System.out.println("No It is Not a Armstrong Number");
    }





    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        int a = sca.nextInt();
        checkArmstrong(a);
    }
}
