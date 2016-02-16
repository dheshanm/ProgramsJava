import java.io.*;
import java.util.Scanner;

/**
 * Created by Dheshan M (@D-codex) on 2/16/2016.
 */
public class arrayConversion {
    public static void main(String args[])throws IOException
    {
        Scanner in=new Scanner(System.in);
        int i,j,k=0;
        System.out.println("Enter value for a 4*4 double dimensional array");
        int a[][]=new int[10][10];
        int b[]=new int[20];
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
                //System.out.print("Enter value for "+i+"x"+j+"   :");
                a[i][j]=in.nextInt();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                b[k]=a[i][j];
                k++;
            }
        }
        System.out.println("RESULT  :\n");
        for(i=0;i<k;i++) {
            System.out.print(b[i] + "\t");
            if ((i+1) % 5 == 0) {
                System.out.println("\n");
            }
        }
    }
}
