import java.io.*;
import java.util.Scanner;

/**
 * Created by Dheshan M (@D-codex) on 11/21/2015.
 */
public class armstrongLike {
    public static void main(String args[])throws IOException
    {
        int n,n1,n2,c=0,d=0,e,f=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number such that the number of digits in the entered number should be divisible by 3 " +
                "\nEnter the Number    :");
        n=in.nextInt();
        n1=n;
        n2=n;
        while(n>0)
        {
            c=c+1;
            n=n/10;
        }
        if(c%3==0) {
            d = c / 3;
            while (n1 > 0) {
                e = (int) (n1 % (Math.pow(10, d)));
                f = f + (e * e * e);
                n1 = (int) (n1 / (Math.pow(10, d)));
            }
            System.out.println();
            if (f == n2)
                System.out.println("The number is an Armstronglike number");
            else
                System.out.println("The number is not an Armstornglike number");
        }
        if(c%3!=0)
        System.out.println("The number doesn't meet the mentioned condition");
    }
}
