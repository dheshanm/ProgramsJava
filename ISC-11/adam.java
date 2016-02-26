import java.util.*;

/**
 * Created by Dheshan M (@D-codex) on 2/26/2016.
 */
public class adam {
    public static int reverse(int m)
    {
        int m1=0,s=0;
        while(m>0){
            s=m%10;
            m1=s+(m1*10);
            m=m/10;
        }
        return(m1);
    }
    public static void main(String args[]){
        int num,rev,b=0,b1=0;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number        :");
        num=in.nextInt();
        rev=reverse(num);
        b=num*num;
        b1=reverse(b);
        if((rev*rev)==b1)
            System.out.println("Adam number");
        else
            System.out.println("Not an Adam number");
    }
}
