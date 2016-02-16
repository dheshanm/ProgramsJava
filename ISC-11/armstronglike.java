import java.io.*;
class armstronglike
{
    public static void main(String ar[])throws IOException
    {
        int n,n1,n2,c=0,d=0,e,f=0;
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter a number.The number of digits in the entered number should be divisile by 3");
        n=Integer.parseInt(in.readLine());
        n1=n;
        n2=n;
        while(n>0)
        {
            c=c+1;
            n=n/10;
        }
        if(c%3==0)
         d=c/3;
        while(n1>0)
        {
            e=(int)(n1%(Math.pow(10,d)));
            f=f+(e*e*e);
            n1=(int)(n1/(Math.pow(10,d)));
        }
        System.out.println();
        if(f==n2)
         System.out.println("The number is an Armstronglike number");
        else
         System.out.println("The number is not an Armstornglike number");
    }
}
