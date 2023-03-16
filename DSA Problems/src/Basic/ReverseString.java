package Basic;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String a)
    {
        String reverse="";
        for(int i=a.length()-1;i>=0;i--)
        {
            reverse+=a.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);
        System.out.println("Plz input the String");
        String a = sca.nextLine();
        System.out.println(reverse(a));

    }


}
