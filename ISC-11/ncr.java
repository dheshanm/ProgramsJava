import java.util.*;

/**
 * Created by Dheshan M (@D-codex) on 2/26/2016.
 */

public class ncr {
    public static int fact(int a)
    {
        if(a==0)
            return(1);
        else
            return(a*fact(a-1));
    }
    public static void main(String args[]){
        int n,r,n1=0,C=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value for 'n'     :");
        n=in.nextInt();
        System.out.print("Enter the value for 'r'     :");
        r=in.nextInt();
        n1=n-r;
        if(n>r)
        {
            int b=fact(n);
            int c=fact(r);
            int d=fact(n1);
            C = b/(c*d);
            System.out.println("nCr ="+C);
        }
        else
            System.out.println("Invalid Input");
    }
}
