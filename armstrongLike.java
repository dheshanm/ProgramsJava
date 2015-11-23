package tutorials.Next;

import java.io.*;
import java.util.*;
/**
 * Created by Dheshan M (@D-codex) on 11/21/2015.
 */
public class armstrongLike {
    public static void main(String args[])throws IOException
    {
        int n,n1,n2,c=0,d=0,a=0,f=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number whose no. of digits is divisible by 3");
        n=in.nextInt();
        n1=n;
        n2=n;
        while(n>0)
        {
            c=c+1;
            n=n/10;
        }
        if(c%3==0)
            d=c/2;
        while(n1>0)
        {
            a=(int)(n1%Math.pow(10,d));
            f=f+(a*a*a);
            n1=(int)(n1/Math.pow(10,d));
        }
        if(n2==f)
            System.out.println("Armstronglike number");
        else
            System.out.println("Not an Armstronglike number");
    }
}
